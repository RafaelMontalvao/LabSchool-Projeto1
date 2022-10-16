package org.devinhouse.projeto1.Model;

import java.util.Comparator;

public class comparacaoAtendimento implements Comparator<Pessoa> {


    public int compare(Aluno aluno, Aluno aluno2) {
        return aluno.compareTo(aluno2.getAtedimento());
    }


    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return 0;
    }
}


