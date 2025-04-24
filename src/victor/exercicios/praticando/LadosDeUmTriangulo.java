package victor.exercicios.praticando;

import java.util.Scanner;

public class LadosDeUmTriangulo {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o lado do triangulo:");
        lado1 = scanner.nextInt();
        System.out.println("Informe o lado do triangulo:");
        lado2 = scanner.nextInt();
        System.out.println("Informe o lado do triangulo:");
        lado3 = scanner.nextInt();

        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            System.out.println("Os lados podem formar um triangulo!");
        }else {
            System.out.println("Os lados não podem formar um triangulo!");
        }
    }
}
