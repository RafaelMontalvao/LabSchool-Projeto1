package org.devinhouse.projeto1.repositorio;

import org.devinhouse.projeto1.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Alunorepository {

    List<Pessoa> relatorioProfessorFront = new ArrayList<>();
    List<Pessoa>relatorioProfessorBack = new ArrayList<>();
    List<Pessoa>relatorioProfessorFull = new ArrayList<>();
    private List<Pessoa> dados = new ArrayList<>();
    private static Integer idAtual = 0;


    public void inserir(Pessoa pessoa) {
        pessoa.setId(++idAtual);

        dados.add(pessoa);
    }

    public Pessoa alterarSituacao(int id, SituacaoMatricula situacaoMatricula) {
        for (Pessoa pessoa : dados) {
            if (pessoa.getId() == id) {
                Aluno aluno = (Aluno) pessoa;
                aluno.setSituacaoMatricula(situacaoMatricula);
            }

        }
        return null;
    }


    public Pessoa atedimentoAluno(int id) {
        for (Pessoa pessoa : dados) {
            if (pessoa.getId() == id) {
                Aluno aluno = (Aluno) pessoa;
                aluno.setAtedimento(aluno.getAtedimento() + 1);
                aluno.setSituacaoMatricula(SituacaoMatricula.ATENDIMENTO_PEDAGOGICO);

            }

        }
        return null;
    }

    public void atendimentoPedagogo(int id) {
        for (Pessoa pessoa : dados) {
            if (pessoa.getId() == id) {
                Pedagogo pedagogo = (Pedagogo) pessoa;
                pedagogo.setAtendimento(pedagogo.getAtendimento() + 1);
            }
        }
    }

    public List<Pessoa> consultar() {
        return dados;
    }



}




