package br.com.escola.jogos.servico;
import br.com.escola.jogos.modelos.Jogador;
import br.com.escola.jogos.modelos.Lado;
import br.com.escola.jogos.modelos.Moeda;
import br.com.escola.jogos.modelos.ResultadoCaraCoroa;
import org.springframework.stereotype.Service;

@Service
public class JogoCaraCoroa {
    private final Moeda moeda;
    public JogoCaraCoroa(){
        this.moeda = new Moeda();
    }    
    public ResultadoCaraCoroa jogar(String textoDoPalpite){
        Lado palpite;
        try{
            palpite = Lado.deTexto(textoDoPalpite);
        } catch(IllegalArgumentException e){
            return new ResultadoCaraCoroa(
                null, 
                null,
                false,
                "Opção inválida! O usuário deve digitar 'cara' ou 'coroa'");
        }
        Jogador jogador = new Jogador();
        jogador.fazerPalpite(palpite);
        Lado resultado = moeda.lancar();
        if(jogador.acertou(resultado)){
            return new ResultadoCaraCoroa(palpite, resultado, true, "Parabéns! Você acertou!!");
        } else {
            return new ResultadoCaraCoroa(palpite, resultado, false, "Errou!! Tente novamente");
        }
    }
}
