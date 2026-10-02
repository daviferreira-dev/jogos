package br.com.escola.jogos.modelos;

public class ResultadoCaraCoroa {

    private Lado palpite;
    private Lado resultado;
    private boolean acertou;
    private String mensagem;

    public ResultadoCaraCoroa(Lado palpite, Lado resultado, boolean acertou, String mensagem) {
        this.palpite = palpite;
        this.resultado = resultado;
        this.acertou = acertou;
        this.mensagem = mensagem;
    }
    public Lado getPalpite(){
        return palpite;
    }
    public Lado getResultado(){
        return resultado;
    }
    public boolean isAcertou(){
        return acertou;
    }
    public String getMensagem(){
        return mensagem;
    }
}
