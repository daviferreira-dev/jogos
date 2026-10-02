package br.com.escola.jogos.controle;

import br.com.escola.jogos.modelos.ResultadoJogada;
import br.com.escola.jogos.servico.JogoAdvinheDado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    private final JogoAdvinheDado jogo;

    public JogoController(JogoAdvinheDado jogo) {
        this.jogo = jogo;
    }

    @GetMapping("/jogar")
    public ResultadoJogada jogar(@RequestParam(defaultValue = "Jogador") String nome, @RequestParam int palpite) {
        return jogo.jogar(nome, palpite);
    }
}
