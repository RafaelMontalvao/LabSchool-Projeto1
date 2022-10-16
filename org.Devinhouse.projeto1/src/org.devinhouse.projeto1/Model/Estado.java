package org.devinhouse.projeto1.Model;

public enum Estado {

    ATIVO,
    INATIVO;

    public static Estado obterCodigo(int codigo) {
        Estado[] estado = Estado.values();
        return estado[codigo - 1];
    }
}
