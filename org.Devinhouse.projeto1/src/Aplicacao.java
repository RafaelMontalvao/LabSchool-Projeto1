import com.sun.source.tree.CaseTree;
import org.devinhouse.projeto1.Cli.Display;
import org.devinhouse.projeto1.Model.*;
import org.devinhouse.projeto1.repositorio.Alunorepository;



import java.util.List;

public class Aplicacao {

    Display display = new Display();
    private Alunorepository alunorepository = new Alunorepository();


    public void executar() {
        Operacao operacao = null;

        while (operacao != Operacao.SAIR) {
            display.menu();
            //         try {
            operacao = display.obterOperacao();
            processar(operacao);
        }
        //         }catch (opcaoInvalidException e){
        //             display.exibirMensagem("Opçao informada é invalida");
    }


    private void processar(Operacao operacao) {
        switch (operacao) {
            case CADASTRO_ALUNO:
                Pessoa aluno = display.cadastro(Operacao.CADASTRO_ALUNO);
                alunorepository.inserir(aluno);
                break;

            case SITUACAO_MATRICULA:
                int id = display.pesquisarId();
                SituacaoMatricula situacaoMatricula = display.estadoMatricula();
                alunorepository.alterarSituacao(id, situacaoMatricula);

                break;

            case CADASTRO_PROFESSOR:
                Pessoa professor = display.cadastro(Operacao.CADASTRO_PROFESSOR);
                alunorepository.inserir(professor);

                break;

            case CADASTRO_PEDAGOGO:
                Pessoa pedagogo = display.cadastro(Operacao.CADASTRO_PEDAGOGO);
                alunorepository.inserir(pedagogo);

                break;

            case REALIZACAO_ATENDIMENTO:
                int id1 = display.atendimentoAluno();
                alunorepository.atedimentoAluno(id1);
                int id2 = display.atendimentoPedagogo();
                alunorepository.atendimentoPedagogo(id2);

                break;

            case LISTAGEM_PESSOAS:
                ListagemPessoas listagemPessoas = display.obterListagem();


                if (listagemPessoas.equals(ListagemPessoas.TODOS)) {
                    List<Pessoa> listapessoa = alunorepository.consultar();
                    display.listarAluno(listapessoa);
                    display.listarProfessor(listapessoa);
                    display.listarPedagogo(listapessoa);



                } else if (listagemPessoas.equals(ListagemPessoas.ALUNOS)) {
                    List<Pessoa>listaAlunos = alunorepository.consultar();
                    display.listarAluno(listaAlunos);


                } else if (listagemPessoas.equals(ListagemPessoas.PROFESSORES)) {
                    List<Pessoa>listaProfessores = alunorepository.consultar();
                    display.listarProfessor(listaProfessores);


                } else if (listagemPessoas.equals(ListagemPessoas.PEDAGOGOS)) {
                    List<Pessoa>listaPedagogo = alunorepository.consultar();
                    display.listarPedagogo(listaPedagogo);

                }
                break;


            case RELATORIO_ALUNOS:
                SituacaoMatricula relatorioALunos = display.estadoMatriculaRelatorio();
                List<Pessoa>listarrelatorioaluno = alunorepository.consultar();
                switch(relatorioALunos){
                    case ATIVO:
                        display.listarAlunorelatorioAtivo(listarrelatorioaluno);
                        break;
                    case INATIVO:
                        display.listarAlunorelatorioInaativo(listarrelatorioaluno);
                        break;
                    case IRREGULAR:
                        display.listarAlunorelatorioIrregular(listarrelatorioaluno);
                        break;
                    case ATENDIMENTO_PEDAGOGICO:
                        display.listarAlunorelatorioAtendimento(listarrelatorioaluno);
                        break;

                        case TODOS:
                        display.listarAlunorelatorioAtivo(listarrelatorioaluno);
                        display.listarAlunorelatorioInaativo(listarrelatorioaluno);
                        display.listarAlunorelatorioIrregular(listarrelatorioaluno);
                        display.listarAlunorelatorioAtendimento(listarrelatorioaluno);

                }


                break;

            case RELATORIO_PROFESSOR:
                ExperienciaDesenvolvimento relatorioProfessor = display.obterExperienciaRelatorio();
                List<Pessoa> relatorioprofessorExperiencia = alunorepository.consultar();
                switch (relatorioProfessor){
                    case FRONT_END:
                        display.listarProfessorRelatorioFront(relatorioprofessorExperiencia);
                        break;
                    case BACK_END:
                        display.listarProfessorRelatorioBach(relatorioprofessorExperiencia);
                        break;

                    case FULL_STACK:
                        display.listarProfessorRelatorioFull(relatorioprofessorExperiencia);
                        break;
                    case TODOS:
                        display.listarProfessorRelatorioFront(relatorioprofessorExperiencia);
                        display.listarProfessorRelatorioBach(relatorioprofessorExperiencia);
                        display.listarProfessorRelatorioFull(relatorioprofessorExperiencia);
                        break;
                }


                break;

            case RELATORIO_ALUNO_ATENDIMENTO:
                List<Pessoa> alunoMaisAtendimento = alunorepository.consultar();
                display.relatorioAlunoAtendimento(alunoMaisAtendimento);

                                break;

            case RELATORIO_PEDAGOGO_ATENDIMENTO:
                System.out.println("pedagogos com mais atendimentos");
                break;


        }


    }


}



