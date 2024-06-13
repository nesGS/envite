package com.nes.envite.entities.enums;


public enum ValorCarta {
    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(8), CABALLO(9), REY(10);

    private final int valor;

    ValorCarta(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
