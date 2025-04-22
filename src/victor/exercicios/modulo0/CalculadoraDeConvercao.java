package victor.exercicios.modulo0;

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
