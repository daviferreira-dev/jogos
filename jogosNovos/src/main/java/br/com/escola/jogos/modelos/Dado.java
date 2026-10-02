package br.com.escola.jogos.modelos;

import java.util.Random;

public class Dado {

    private int lados;
    private int valorAtual;
    private Random random;

    public Dado() {
        this(6);
    }

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    public int lancar() {
        valorAtual = random.nextInt(lados) + 1;
        return valorAtual;
    }

    public int getValorAtual() {
        return valorAtual;
    }

    public int getLados() {
        return lados;
    }
}

