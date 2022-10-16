package org.devinhouse.projeto1.Model;

public enum ExperienciaDesenvolvimento {

    TODOS,
    FRONT_END,
    BACK_END,
    FULL_STACK;


    public static ExperienciaDesenvolvimento obterCodigo(int codigo){
        ExperienciaDesenvolvimento[] experiencia = ExperienciaDesenvolvimento.values();
        return experiencia [codigo];

    }

}
