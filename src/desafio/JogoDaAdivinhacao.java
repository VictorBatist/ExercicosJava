package desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativa;
        int numeroDeTentativas = 5;

        while (numeroDeTentativas > 0){
            System.out.println("\nInforme um numero entra 0 e 100");
           // System.out.println("numero secreto é: " + numeroAleatorio);
            tentativa = scanner.nextInt();

            if (tentativa == numeroAleatorio){
                System.out.println("Parabens, você acertou o numero! :)");
                break;
            }else {
                System.out.println("você errou o numero! :(");
                System.out.println("Lhe restão " + (numeroDeTentativas - 1) + " tentativas");

                if(tentativa < numeroAleatorio){
                    System.out.println("O numero é maior que " + tentativa);
                }else {
                    System.out.println("O numero é menor que " + tentativa);
                }
            }
            numeroDeTentativas--;
        }
    }
}
