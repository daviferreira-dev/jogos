package com.example.demo.service;

import com.example.demo.dto.ResultadoJogo;
import com.example.demo.model.Dado;
import com.example.demo.model.Jogador;
import org.springframework.stereotype.Service;

@Service
public class JogoService {
    private final Dado dado;

    public JogoService(Dado dado) {
        this.dado = dado;
    }

    public ResultadoJogo jogar(int palpite) {
        if (palpite < 1 || palpite > 6) {
            throw new IllegalArgumentException("O palpite deve ser um número de 1 a 6.");
        }

        Jogador jogador = new Jogador();
        jogador.fazerPalpite(palpite);

        int resultado = dado.lancar();
        boolean acertou = jogador.acertou(resultado);
        String mensagem = acertou
                ? "Parabéns! Você acertou o palpite."
                : "Que peninha! Errouuu.";

        return new ResultadoJogo(palpite, resultado, acertou, mensagem);
    }
}
