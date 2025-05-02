//Crie um programa que solicite ao usuário digitar um número.
//Se o número for positivo, exiba "Número positivo", caso contrário,
//exiba "Número negativo".

package victor.exercicios.modulo0.exercicio2;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero");
        numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("O numero é positivo!");
        }else {
            System.out.println("O numero é negativo!");
        }
    }
}
