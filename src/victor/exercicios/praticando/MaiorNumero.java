package victor.exercicios.praticando;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int firtsNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        firtsNumber = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        secondNumber = scanner.nextInt();

        if (firtsNumber > secondNumber){
            System.out.println("O maior numero é %d".formatted(firtsNumber));
        }else if(firtsNumber < secondNumber){
            System.out.println("O maior numero é %d".formatted(secondNumber));
        }else {
            System.out.println("Os numeros são iguais");
        }
    }
}
