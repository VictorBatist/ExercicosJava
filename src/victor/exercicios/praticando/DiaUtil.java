package victor.exercicios.praticando;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        String diaDaSemana;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia da semana (sem acentos e com todas as letras minusculas) para saber se é um dia util");
        diaDaSemana = scanner.nextLine();

        switch (diaDaSemana){
            case "segunda":
                System.out.println("Dia util");
                break;
            case "terça":
                System.out.println("Dia util");
                break;
            case "quarta":
                System.out.println("Dia util");
                break;
            case "quinta":
                System.out.println("Dia util");
                break;
            case "sexta":
                System.out.println("Dia util");
                break;
            case "sabado":
                System.out.println("Sabádo não é dia util");
                break;
            case "domingo":
                System.out.println("Domingo não é dia util");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
