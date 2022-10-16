package org.devinhouse.projeto1.Cli;

import org.devinhouse.projeto1.Model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Display {

    Scanner scanner = new Scanner(System.in);
    List<Pessoa> relatorioProfessorFront = new ArrayList<>();
    List<Pessoa> relatorioProfessorBack = new ArrayList<>();
    List<Pessoa> relatorioProfessorFull = new ArrayList<>();

    public void menu() {
        System.out.println();
        System.out.println("                               Menu                                     ");
        System.out.println("=======================================================================|");
        System.out.println("|  0 - Sair                                                            |");
        System.out.println("|  1 - Cadastro Aluno                                                  |");
        System.out.println("|  2 - Situaçao matriucula do aluno                                    |");
        System.out.println("|  3 - Cadastro Professor                                              |");
        System.out.println("|  4 - Cadastro Pedagogo                                               |");
        System.out.println("|  5 - Realizaçao Atendimento Pedagogico                               |");
        System.out.println("|  6 - Listagem de Pessoas                                              |");
        System.out.println("|  7 - Relatorio dos Alunos                                            |");
        System.out.println("|  8 - Relatorio dos professores                                       |");
        System.out.println("|  9 - Relatorio dos Alunos com mais atendimentos pedagogicos          |");
        System.out.println("| 10 - Relatorio dos Pedagogos com mais atendimentos pedagogicos       |");

        System.out.println("                                                                        ");
    }

    public Operacao obterOperacao() {
        System.out.println("Digite a opçao deseja: ");
        Scanner scanner = new Scanner(System.in);
        int codOpcaop = scanner.nextInt();
        //   if(codOpcaop < 0 || codOpcaop>Operacao.values().length) {
        //        throw new opcaoInvalidException();
        // }
        Operacao operacao = Operacao.obterCodigo(codOpcaop);
        return operacao;
    }

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Pessoa cadastro(Operacao tipoCadastro) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.println("Digite o telefone: ");
        Integer telefone = scanner.nextInt();
        System.out.println();
        System.out.println("Digite a data de nascimento dd/MM/yyyy");
        LocalDate dataNascimento;
        String dNascimento = scanner.next();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataNascimento = LocalDate.parse(dNascimento, formatador);
        System.out.println();
        System.out.println("Digite o Cpf");
        String cpf = scanner.next();
        int atendimento = 0;

        if (tipoCadastro == Operacao.CADASTRO_ALUNO) {
            System.out.println("digite a nota do processo seletivo: ");
            double nota = scanner.nextDouble();
            SituacaoMatricula situacaoMatricula = estadoMatricula();
            pessoa = new Aluno(nome, telefone, dataNascimento, cpf, situacaoMatricula, nota, atendimento);

        } else if (tipoCadastro == Operacao.CADASTRO_PROFESSOR) {
            FormacaoAcademica formacaoAcademica = obterFormacao();
            ExperienciaDesenvolvimento experienciaDesenvolvimento = obterExperiencia();
            Estado estado = obterEstado();
            pessoa = new Professor(nome, telefone, dataNascimento, cpf, formacaoAcademica, experienciaDesenvolvimento, estado);

        } else if (tipoCadastro == Operacao.CADASTRO_PEDAGOGO) {

            pessoa = new Pedagogo(nome, telefone, dataNascimento, cpf, atendimento);

        }

        return pessoa;
    }

    public Estado obterEstado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a situação do Professor:");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  1 - ATIVO                |");
        System.out.println("  |  2 - INATIVO              |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        Estado estado = Estado.obterCodigo(codOpcaop);
        return estado;


    }


    public ExperienciaDesenvolvimento obterExperiencia() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual Experiencia em Desenvolviemnto? ");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  1 - Front End            |");
        System.out.println("  |  2 - Back End             |");
        System.out.println("  |  3 - Full Stack           |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        ExperienciaDesenvolvimento experienciaDesenvolvimento = ExperienciaDesenvolvimento.obterCodigo(codOpcaop);
        return experienciaDesenvolvimento;

    }


    public ExperienciaDesenvolvimento obterExperienciaRelatorio() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual Experiencia em Desenvolviemnto? ");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  0 - Todos                |");
        System.out.println("  |  1 - Front End            |");
        System.out.println("  |  2 - Back End             |");
        System.out.println("  |  3 - Full Stack           |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        ExperienciaDesenvolvimento experienciaDesenvolvimento = ExperienciaDesenvolvimento.obterCodigo(codOpcaop);
        return experienciaDesenvolvimento;
    }

    private FormacaoAcademica obterFormacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual formaçao academica: ");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  1 - Graduação Incompleta |");
        System.out.println("  |  2 - Graduação Completa   |");
        System.out.println("  |  3 - Mestrado             |");
        System.out.println("  |  4 - Doutorado            |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        FormacaoAcademica formacaoAcademica = FormacaoAcademica.obterCodigo(codOpcaop);
        return formacaoAcademica;


    }


    public SituacaoMatricula estadoMatricula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a situação da matricula do aluno:");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  1 - ATIVO                |");
        System.out.println("  |  2 - IRRGULAR             |");
        System.out.println("  |  3 - ATEDIMENTO PEDAGOGICO|");
        System.out.println("  |  4 - INATIVO              |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        SituacaoMatricula matricula = SituacaoMatricula.obterCodigo(codOpcaop);

        return matricula;

    }


    public ListagemPessoas obterListagem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quem voce deseja listar?");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  0 - TODOS                |");
        System.out.println("  |  1 - ALUNOS               |");
        System.out.println("  |  2 - PROFESSORES          |");
        System.out.println("  |  3 - PEDAGOGOS            |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        ListagemPessoas listagemPessoas = ListagemPessoas.obterCodigo(codOpcaop);
        return listagemPessoas;
    }

    public SituacaoMatricula estadoMatriculaRelatorio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esolha a situação que deseja o Relatorio:");
        System.out.println();
        System.out.println();
        System.out.println("  =============================");
        System.out.println("  |  0 - TODOS                |");
        System.out.println("  |  1 - ATIVO                |");
        System.out.println("  |  2 - IRRGULAR             |");
        System.out.println("  |  3 - ATEDIMENTO PEDAGOGICO|");
        System.out.println("  |  4 - INATIVO              |");
        System.out.println("  =============================");

        int codOpcaop = scanner.nextInt();
        SituacaoMatricula matricula = SituacaoMatricula.obterCodigo(codOpcaop);

        return matricula;
    }

    public int pesquisarId() {
        System.out.print("Informe o Codigo: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println();
        return id;
    }

    public int atendimentoAluno() {
        System.out.println(" Digite o codigo do aluno para atendimento: ");

        int idAluno = pesquisarId();

        return idAluno;
    }

    public int atendimentoPedagogo() {
        System.out.println("Digite o Codigo do Pedagogo para atedimento: ");
        int idPedagogo = pesquisarId();
        return idPedagogo;

    }

    public void listar(List<Pessoa> pessoas) {
        System.out.println("oi");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);

        }
    }

    public void listarAluno(List<Pessoa> pessoas) {
        System.out.println("Listar Aluno");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                System.out.println(aluno.exibir());
            }


        }
    }

    public void listarProfessor(List<Pessoa> pessoas) {
        System.out.println("Listar Professor");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                System.out.println(professor.exibir());
            }
        }
    }

    public void listarPedagogo(List<Pessoa> pessoas) {
        System.out.println("Listar Pedagogo");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Pedagogo) {
                Pedagogo pedagogo = (Pedagogo) pessoa;
                System.out.println(pedagogo.exibir());
            }
        }
    }


    public void listarAlunorelatorioAtivo(List<Pessoa> pessoas) {
        System.out.println("Relatorio Alunos");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                if (aluno.getSitucaoMatricula().equals(SituacaoMatricula.ATIVO)) {
                    System.out.println(aluno.exibirRelatorio());
                }


            }
        }
    }

    public void listarAlunorelatorioInaativo(List<Pessoa> pessoas) {
        System.out.println("Relatorio Alunos");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                if (aluno.getSitucaoMatricula().equals(SituacaoMatricula.INATIVO)) {
                    System.out.println(aluno.exibirRelatorio());
                }


            }
        }
    }

    public void listarAlunorelatorioIrregular(List<Pessoa> pessoas) {
        System.out.println("Relatorio Alunos");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                if (aluno.getSitucaoMatricula().equals(SituacaoMatricula.IRREGULAR)) {
                    System.out.println(aluno.exibirRelatorio());
                }


            }
        }
    }

    public void listarAlunorelatorioAtendimento(List<Pessoa> pessoas) {
        System.out.println("Relatorio Alunos");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                if (aluno.getSitucaoMatricula().equals(SituacaoMatricula.ATENDIMENTO_PEDAGOGICO)) {
                    System.out.println(aluno.exibirRelatorio());
                }


            }
        }

    }

    public void listarProfessorRelatorioFront(List<Pessoa> pessoas) {
        System.out.println("Listar Professor");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                if (professor.getExperienciaDesenvolvimento().equals(ExperienciaDesenvolvimento.FRONT_END)) {
                    System.out.println(professor.exibirRelatorio());

                }
            }
        }
    }

    public void listarProfessorRelatorioBach(List<Pessoa> pessoas) {
        System.out.println("Listar Professor");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                if (professor.getExperienciaDesenvolvimento().equals(ExperienciaDesenvolvimento.BACK_END)) {
                    System.out.println(professor.exibir());

                }
            }
        }
    }

    public void listarProfessorRelatorioFull(List<Pessoa> pessoas) {
        System.out.println("Listar Professor");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                if (professor.getExperienciaDesenvolvimento().equals(ExperienciaDesenvolvimento.FULL_STACK)) {
                    System.out.println(professor.exibir());
                }
            }
        }
    }

    public void relatorioAlunoAtendimento(List<Pessoa> alunoMaisAtendimento) {
        for (Pessoa pessoa : alunoMaisAtendimento) {
            if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;

                System.out.println(aluno.exibirRelatorio());

    }
}}}















