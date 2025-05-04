/*Crie um menu que oferece duas opções ao usuário:
"1. Calcular área do quadrado" e "2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

package victor.exercicios.modulo0.exercicio2;

import java.util.Scanner;

public class AreaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Escolha a opção:
                1 - Calcular area do quadrado
                2 - Calcular area do circulo
                3 - Sair
                """);
        int opcao = scanner.nextInt();

        if(opcao == 1){
            int lado;
            System.out.println("Informe o tamanho do lado do quadrado:");
            lado = scanner.nextInt();

            System.out.println("A area do quadrado é " + lado*lado);
        }else if(opcao == 2){
            double raio;
            double PI = 3.14;
            System.out.println("Informe o raio da circunferencia:");
            raio = scanner.nextDouble();
            System.out.println("A area do circulo é " + (raio*raio) * PI);
        }else if(opcao == 3){
            System.out.println("Saindo...");
        }else {
            System.out.println("0 opção incorreta! Selecione 1, 2 ou 3");
        }
    }
}
