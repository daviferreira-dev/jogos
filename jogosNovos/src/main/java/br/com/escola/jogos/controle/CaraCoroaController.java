package br.com.escola.jogos.controle;
import br.com.escola.jogos.modelos.ResultadoCaraCoroa;
import br.com.escola.jogos.servico.JogoCaraCoroa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caracoroa")
public class CaraCoroaController {
    private final JogoCaraCoroa jogo;
    public CaraCoroaController(JogoCaraCoroa jogo){
        this.jogo = jogo;
    } 
    @GetMapping("/jogar")
    public ResultadoCaraCoroa jogar(@RequestParam String palpite){
        return jogo.jogar(palpite);
    }
}
