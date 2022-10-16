package org.devinhouse.projeto1.Model;

import java.util.List;

public enum ListagemPessoas {

    TODOS,
    ALUNOS,
    PROFESSORES,
    PEDAGOGOS;



    public static ListagemPessoas obterCodigo(int codigo){
        ListagemPessoas[] listagemPessoas = ListagemPessoas.values();
        return listagemPessoas[codigo];

}}


