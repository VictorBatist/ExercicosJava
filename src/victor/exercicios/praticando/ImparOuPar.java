package victor.exercicios.praticando;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        System.out.println("Informe um numero inteiro para descobrir se ele é PAR ou IMPAR:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int resultado = numero % 2;

        if(resultado == 0){
            System.out.println("O numero " + numero + " é PAR");
        }else{
            System.out.println("O numero " + numero + " é IMPAR");
        }

    }
}
