package org.devinhouse.projeto1.Model;

import java.time.LocalDate;

public abstract class Pessoa implements Comparable{

     String nome;
     Integer telefone;
     LocalDate dataNascimento;
     String cpf;
     int id;

     public Pessoa(){};


    public Pessoa(String nome, Integer telefone, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String exibir(){
        return " Professor: Id" + id  + "Nome: " + nome + "cpf:  "+ cpf;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public  int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id= id;
    }
}
