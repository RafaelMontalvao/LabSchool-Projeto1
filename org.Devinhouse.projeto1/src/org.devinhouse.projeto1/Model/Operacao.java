package org.devinhouse.projeto1.Model;

public enum Operacao {

    SAIR,
    CADASTRO_ALUNO,
    SITUACAO_MATRICULA,
    CADASTRO_PROFESSOR,
    CADASTRO_PEDAGOGO,
    REALIZACAO_ATENDIMENTO,
    LISTAGEM_PESSOAS,
    RELATORIO_ALUNOS,
    RELATORIO_PROFESSOR,
    RELATORIO_ALUNO_ATENDIMENTO,
    RELATORIO_PEDAGOGO_ATENDIMENTO;



    public static Operacao obterCodigo(int codigo) {
        Operacao[] operacoes = Operacao.values();
        return operacoes[codigo];
    }}


