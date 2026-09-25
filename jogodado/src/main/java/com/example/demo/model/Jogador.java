package com.example.demo.model;

public class Jogador {
    private int palpite;

    public void fazerPalpite(int palpite) {
        this.palpite = palpite;
    }

    public int getPalpite() {
        return palpite;
    }

    public boolean acertou(int resultado) {
        return palpite == resultado;
    }
}
