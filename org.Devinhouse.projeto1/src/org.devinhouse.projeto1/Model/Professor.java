package org.devinhouse.projeto1.Model;

import java.time.LocalDate;

public class Professor extends Pessoa{

    FormacaoAcademica formacaoAcademica;
    ExperienciaDesenvolvimento experienciaDesenvolvimento;
    Estado estado;

    public Professor(String nome, Integer telefone, LocalDate dataNascimento, String cpf, FormacaoAcademica formacaoAcademica, ExperienciaDesenvolvimento experienciaDesenvolvimento, Estado estado) {
        super(nome, telefone, dataNascimento, cpf);
        this.formacaoAcademica = formacaoAcademica;
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
        this.estado = estado;
    }


    public String exibir(){
        return " Professor: Id " + id  + "|  Nome: " + nome + " | cpf:  " + cpf ;
    }
    public String exibirRelatorio(){
        return " Professor: Id " + id  + "|  Nome: " + nome + " | Formação  " + formacaoAcademica + " | Experiencia "+ experienciaDesenvolvimento + " | Estado "+ estado ;
    }

    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public ExperienciaDesenvolvimento getExperienciaDesenvolvimento() {
        return experienciaDesenvolvimento;
    }

    public void setExperienciaDesenvolvimento(ExperienciaDesenvolvimento experienciaDesenvolvimento) {
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    @Override
    public int compareTo(Object o) {
        return  this.nome.compareTo(getNome());


    }
}


