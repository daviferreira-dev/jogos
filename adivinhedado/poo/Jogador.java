package adivinhedado.poo;

public class Jogador {
    private int palpite;

    public void fazerPalpite(int palpite) {
        this.palpite = palpite;
    }

    public boolean acertou(int resultado) {
        return palpite == resultado;
    }
}
