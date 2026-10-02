package br.com.escola.jogos.modelos;

public class ResultadoJogada {

    private String nomeJogador;
    private int palpite;
    private int resultado;
    private boolean acertou;
    private String mensagem;

    public ResultadoJogada(
            String nomeJogador,
            int palpite,
            int resultado,
            boolean acertou,
            String mensagem
    ) {
        this.nomeJogador = nomeJogador;
        this.palpite = palpite;
        this.resultado = resultado;
        this.acertou = acertou;
        this.mensagem = mensagem;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getPalpite() {
        return palpite;
    }

    public int getResultado() {
        return resultado;
    }

    public boolean isAcertou() {
        return acertou;
    }

    public String getMensagem() {
        return mensagem;
    }

}
