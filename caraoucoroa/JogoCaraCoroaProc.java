package caraoucoroa;

import java.util.Random;
import java.util.Scanner;
public class JogoCaraCoroaProc {
    public static void main(String[] args)    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Cara ou Coroa");
        System.out.println("Digite 'cara' ou 'coroa': ");
        String palpiteUsuario = scanner.nextLine().toLowerCase();
        int resultado = random.nextInt(2); // 0 -cara ao 1 -coroa
        String resultadoMoeda;
        if (resultado == 0){
            resultadoMoeda = "cara";
        } else{
            resultadoMoeda = "coroa";
        }
        System.out.println("O resultado foi: " + resultadoMoeda);
        if (palpiteUsuario.equals(resultadoMoeda)){
            System.out.println("Parabéns! Você ganhou");
        } else {
            System.out.println("Perdeu! Tente novamente.");
        }
        scanner.close();

    }
}