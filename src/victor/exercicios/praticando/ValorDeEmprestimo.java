package victor.exercicios.praticando;

import java.util.Scanner;

public class ValorDeEmprestimo {
    public static void main(String[] args) {
        double valorMinimoEmprestimo = 1000.00;
        double valorMaximoEmprestimo = 5000.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Cliente! Informe o valor que deseja realizar o emprestimo");

        double valorEmprestimo = scanner.nextDouble();

        if (valorEmprestimo >= valorMinimoEmprestimo && valorEmprestimo <= valorMaximoEmprestimo){
            System.out.println("""
                    O valor R$ %.2f está dentro do intervalo permitido para empréstimos,
                    em breve entraremos em contato para mais informações
                    """.formatted(valorEmprestimo));
        }else {
            System.out.println("""
                    O valor R$ %.2f não está dentro do intervalo permitido para empréstimos 
                    """.formatted(valorEmprestimo));
        }
    }
}
