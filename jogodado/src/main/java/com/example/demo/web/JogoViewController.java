package com.example.demo.web;

import com.example.demo.dto.ResultadoJogo;
import com.example.demo.service.JogoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JogoViewController {
    private final JogoService jogoService;

    public JogoViewController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping("/")
    public String index() {
        return "jogo";
    }

    @PostMapping("/jogo/web")
    public String jogar(@RequestParam int palpite, Model model) {
        try {
            ResultadoJogo resultado = jogoService.jogar(palpite);
            model.addAttribute("resultado", resultado);
        } catch (IllegalArgumentException ex) {
            model.addAttribute("erro", ex.getMessage());
        }
        return "jogo";
    }
}
