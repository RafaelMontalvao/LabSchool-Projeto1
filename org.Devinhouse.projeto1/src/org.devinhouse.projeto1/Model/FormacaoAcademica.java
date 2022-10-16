package org.devinhouse.projeto1.Model;

public enum FormacaoAcademica {

    GRADUACAO_INCOMPLETA,
    GRADUACAO_COMPLETA,
    MESTRADO,
    DOUTORADO;


    public static FormacaoAcademica obterCodigo(int codigo){
        FormacaoAcademica[] formacao= FormacaoAcademica.values();
        return formacao [codigo-1];

    }

}


