package victor.exercicios.modulo0;

public class Produto {
    public static void main(String[] args) {
        double precoProduto;
        int quantidade;

        precoProduto = 6.50;
        quantidade = 15;

        double valorDaRemessa = precoProduto * quantidade;

        System.out.println("O valor da remessa é: ." + valorDaRemessa);
    }
}
