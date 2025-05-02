package victor.exercicios.modulo1.exercicio1;

import java.util.Scanner;

public class Calculadora {
    public static int dobroDeUmNumero(int numero){
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        int resultado = dobroDeUmNumero(numero);

        System.out.println("""
                
                O dobro do numero %d
                é: %d
                """.formatted(numero, resultado));
    }


}
