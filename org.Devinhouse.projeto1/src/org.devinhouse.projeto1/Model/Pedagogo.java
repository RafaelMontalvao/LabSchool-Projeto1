package org.devinhouse.projeto1.Model;

import java.time.LocalDate;

public class Pedagogo extends Pessoa{


   public int atendimento = 0;

    public Pedagogo(String nome, Integer telefone, LocalDate dataNascimento, String cpf, int atendimento) {
        super(nome, telefone, dataNascimento, cpf);
        this.atendimento = atendimento;
    }

    public String exibir(){
        return " Pedagogo: Id " + id  + " | Nome: " + nome + " | cpf:  ";
    }





    public int getAtendimento() {

        return atendimento;
    }

    public void setAtendimento(int atendimento) {

        this.atendimento = atendimento;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

