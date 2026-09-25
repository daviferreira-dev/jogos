package caraoucoroa;

public class Jogador {
    private Lado palpite;
    public void fazerPalpite(Lado palpite){
        this.palpite = palpite;
    }
    public boolean acertou(Lado resultado){
        return palpite == resultado;
    }
}