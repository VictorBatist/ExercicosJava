package victor.exercicios.praticando;

import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for(int i = 0; i < 3; i++ ){
            System.out.println("Informe a nota da " + (i+1) + " Avaliação:");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma/3;

        if (media>=7.0){
            System.out.println("O estudante teve média %.1f e foi aprovado!".formatted(media));
        } else if (media>=5.0 && media<=6.9) {
            System.out.println("O estudante teve média %.1f e está na recuperação!".formatted(media));
        }else {
            System.out.println("O estudante teve média %.1f e foi reprovado!".formatted(media));
        }
    }
}
