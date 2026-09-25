package caraoucoroa;

import java.util.Scanner;
public class JogoCaraCoroa {
    private final Moeda moeda;
    private final Jogador jogador;
    private final Scanner scanner;
    public JogoCaraCoroa(){
        this.moeda = new Moeda();
        this.jogador = new Jogador();
        this.scanner = new Scanner(System.in);
    }
    public void jogar(){
        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Cara ou Coroa!");
        jogador.fazerPalpite(lerPalpite());
        Lado resultado = moeda.lancar();
        System.out.println("O resultado foi: ");
        System.out.println(resultado.getDescricao());
        if(jogador.acertou(resultado)){
            System.out.println("Parabéns! Acertou!");
        } else {
            System.out.println("Errou! Tente novamente");
        }
    }
    private Lado lerPalpite(){
        while (true){
            System.out.println("Digite 'cara' ou 'coroa': ");
            String texto = scanner.nextLine();
            try {
                return Lado.deTexto(texto);
            } catch (IllegalArgumentException e){
                System.out.println("Opção inválida");
            }
        }
    }
    public static void main(String[] args){
        JogoCaraCoroa jogo = new JogoCaraCoroa();
        jogo.jogar();
    }

    
}