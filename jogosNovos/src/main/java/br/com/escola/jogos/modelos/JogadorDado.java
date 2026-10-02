package br.com.escola.jogos.modelos;

public class JogadorDado {

    private String nome;
    private int palpite;

    public JogadorDado(String nome) {
        this.nome = nome;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    public int getPalpite() {
        return palpite;
    }

    public String getNome() {
        return nome;
    }

}
