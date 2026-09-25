package adivinhedado.procedural;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinheDadoProc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo Adivinhe o Dado!");
        System.out.print("Digite um número de 1 a 6: ");
        int palpite = Integer.parseInt(scanner.nextLine().trim());

        int resultado = random.nextInt(6) + 1;
        System.out.println("O dado caiu em: " + resultado);

        if (palpite == resultado) {
            System.out.println("Parabéns! Você acertou o palpite.");
        } else {
            System.out.println("Que pena! Você errou o palpite.");
        }

        scanner.close();
    }
}
