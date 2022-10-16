package org.devinhouse.projeto1.Model;

public enum SituacaoMatricula {

    TODOS,
    ATIVO,
    IRREGULAR,
    ATENDIMENTO_PEDAGOGICO,
    INATIVO;


    public static SituacaoMatricula obterCodigo(int codigo){
        SituacaoMatricula[] matricula = SituacaoMatricula.values();
        return matricula[codigo];

    }






}
