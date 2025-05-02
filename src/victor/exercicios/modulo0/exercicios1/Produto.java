//Declare uma variável do tipo double precoProduto e
//uma variável do tipo int (quantidade).
//Calcule o valor total multiplicando o preço do produto
//pela quantidade e apresente o resultado em uma mensagem.

package victor.exercicios.modulo0.exercicios1;

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
