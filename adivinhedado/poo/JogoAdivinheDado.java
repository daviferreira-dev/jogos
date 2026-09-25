package adivinhedado.poo;

import java.util.Scanner;

public class JogoAdivinheDado {
    private final Dado dado;
    private final Jogador jogador;
    private final Scanner scanner;

    public JogoAdivinheDado() {
        this.dado = new Dado();
        this.jogador = new Jogador();
        this.scanner = new Scanner(System.in);
    }

    public void jogar() {
        System.out.println("Bem-vindo ao jogo Adivinhe o Dado!");
        jogador.fazerPalpite(lerPalpite());

        int resultado = dado.lancar();
        System.out.println("O dado caiu em: " + resultado);

        if (jogador.acertou(resultado)) {
            System.out.println("Parabéns! Você acertou o palpite.");
        } else {
            System.out.println("Que pena! Você errou o palpite.");
        }
    }

    private int lerPalpite() {
        while (true) {
            System.out.print("Digite um número de 1 a 6: ");
            String texto = scanner.nextLine().trim();
            try {
                int numero = Integer.parseInt(texto);
                if (numero >= 1 && numero <= 6) {
                    return numero;
                }
            } catch (NumberFormatException e) {
                // ignora e pede novamente
            }
            System.out.println("Número inválido. Digite um valor de 1 a 6.");
        }
    }

    public static void main(String[] args) {
        JogoAdivinheDado jogo = new JogoAdivinheDado();
        jogo.jogar();
    }
}
