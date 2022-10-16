package org.devinhouse.projeto1.Model;

import java.time.LocalDate;
import java.util.List;

public class Aluno extends Pessoa{

    private SituacaoMatricula situcaoMatricula;
    private double nota;
    public int atendimento;

    public Aluno(){
    };

    public Aluno(SituacaoMatricula situcaoMatricula) {
       this.situcaoMatricula = situcaoMatricula;
  }

    public Aluno(String nome, Integer telefone, LocalDate dataNascimento, String cpf, SituacaoMatricula situcaoMatricula, double nota, int atedimento) {
        super(nome, telefone, dataNascimento, cpf);
        this.situcaoMatricula = situcaoMatricula;
        this.nota = nota;
        this.atendimento = atendimento;
    }


    public String exibir(){
        return " Aluno: Id " + id  + "  | Nome: " + nome + " | cpf:  " + cpf;
    }

    public String exibirRelatorio(){
        return " Aluno: Id  " + id  + " | Nome:  " + nome + " | Nota: " + nota + " | Total atedimento  " + atendimento;
    }





    public SituacaoMatricula getSitucaoMatricula() {
        return situcaoMatricula;
    }

    public void setSitucaoMatricula(SituacaoMatricula situcaoMatricula) {
        this.situcaoMatricula = situcaoMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAtedimento() {
        return atendimento;
    }

    public void setAtedimento(int atedimento) {
        this.atendimento = atedimento;
    }

    public void setSituacaoMatricula(SituacaoMatricula situacaoMatricula){
        this.situcaoMatricula = situacaoMatricula;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Aluno) {
            Aluno aluno = (Aluno) o;
           if (this.atendimento== atendimento){

           }
    }
        return 0;}
}








