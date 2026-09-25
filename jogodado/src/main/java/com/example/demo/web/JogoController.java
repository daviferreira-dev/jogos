package com.example.demo.web;

import com.example.demo.dto.PalpiteRequest;
import com.example.demo.dto.ResultadoJogo;
import com.example.demo.service.JogoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogoController {
    private final JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping("/jogo")
    public ResultadoJogo jogarPorParametro(@RequestParam int palpite) {
        return jogoService.jogar(palpite);
    }

    @PostMapping("/jogo")
    public ResultadoJogo jogarPorCorpo(@RequestBody PalpiteRequest request) {
        return jogoService.jogar(request.palpite());
    }
}
