package victor.exercicios.praticando;

import java.util.Scanner;

public class RequisitosDeDoacao {
    public static void main(String[] args) {
        int idade;
        double peso;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do doador:");
        idade = scanner.nextInt();
        System.out.println("Informe o peso em Kg do doador:");
        peso = scanner.nextDouble();

        boolean requisitoIdade = idade>=18 && idade<=65;
        boolean requisitoPeso = peso >= 50.00;

        if (requisitoIdade && requisitoPeso){
            System.out.println("Doador compativel :)");
        }else{
            System.out.println("Doador não compativel :(");
            System.out.println("Motivo:");
            if (!requisitoIdade){
                System.out.println("O doador tem que ter entre 18 e 65 anos!");
            }
            if (!requisitoPeso){
                System.out.println("O doador tem que tem mais de 50 Kg");
            }
        }
    }
}
