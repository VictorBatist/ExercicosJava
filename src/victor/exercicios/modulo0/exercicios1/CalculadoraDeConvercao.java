//Declare uma variável do tipo double valorEmDolares.
//Atribua um valor em dólares a essa variável.
//Considere que o valor de 1 dólar é equivalente a 4.94 reais.
//Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

package victor.exercicios.modulo0.exercicios1;

public class CalculadoraDeConvercao {
    public static void main(String[] args) {
        double valorEmDolares;
        double valorAtualDoDolar = 4.94;
        double quantidadeDeDolares = 5.48;

        valorEmDolares = valorAtualDoDolar * quantidadeDeDolares;

        System.out.println("""
                O valor de U$ %.2f
                é de R$ %.2f
                """.formatted(quantidadeDeDolares,valorEmDolares));

    }
}
