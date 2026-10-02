package br.com.escola.jogos.servico;

import br.com.escola.jogos.modelos.Dado;
import br.com.escola.jogos.modelos.JogadorDado;
import br.com.escola.jogos.modelos.ResultadoJogada;
import org.springframework.stereotype.Service;

@Service
public class JogoAdvinheDado {
    private Dado dado;

    public JogoAdvinheDado() {
        this.dado = new Dado();
    }

    public ResultadoJogada jogar(String nome, int palpite) {
        JogadorDado jogador = new JogadorDado(nome);
        jogador.setPalpite(palpite);
        if (jogador.getPalpite() < 1 || jogador.getPalpite() > dado.getLados()) {
            return new ResultadoJogada(
                jogador.getNome(),
                jogador.getPalpite(),
                0,
                false,
                "Palpite inválido. Escolha entre 1 e " + dado.getLados()
            );
        }
        int resultado = dado.lancar();
        boolean acertou = resultado == jogador.getPalpite();
        String mensagem = acertou
            ? "Parabéns, " + jogador.getNome() + "! Você acertou!"
            : "Que pena, " + jogador.getNome() + ". O dado caiu em " + resultado + ".";
        return new ResultadoJogada(
            jogador.getNome(),
            jogador.getPalpite(),
            resultado,
            acertou,
            mensagem
        );
    }
}
