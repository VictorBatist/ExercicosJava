/*Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando
se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

package victor.exercicios.modulo0.exercicio2;

import java.util.Scanner;

public class AnaliseDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Informe dois numeros:");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        if(numero1 == numero2){
            System.out.println("Os numero são iguais!");
        }else{
            System.out.println("Os numeros são diferentes!");
            if (numero1>numero2){
                System.out.println("O numero " + numero1 + " é maior que o numero " + numero2);
            }else {
                System.out.println("O numero " + numero1 + " é menor que o numero " + numero2);
            }
        }
    }
}
