package victor.exercicios.praticando;

import java.util.Scanner;

public class AplicandoDesconto {
    public static void main(String[] args) {
        double DESCONTO = 0.10;
        double VALOR_PARA_DESCONTO = 100.00;
        double valorDaCompra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        valorDaCompra = scanner.nextDouble();

        if(valorDaCompra >= VALOR_PARA_DESCONTO){
            double valorComDesconto = valorDaCompra - (valorDaCompra * DESCONTO);
            System.out.println("Desconto de 10% aplicado!\nvalor total de: R$ " + valorComDesconto);
        }else {
            System.out.println("Nenhum desconto aplicado!\nvalor total de R$ " + valorDaCompra);
        }

    }
}
