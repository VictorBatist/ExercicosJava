/*Declare uma variável do tipo double precoOriginal.
Atribua um valor em reais a essa variável, representando o preço original de um produto.
Em seguida, declare uma variável do tipo double percentualDesconto e
atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e
imprima o novo preço com desconto.*/

package victor.exercicios.modulo0.exercicios1;

public class CalculadoraDeDescontos {
    public static void main(String[] args) {
        double precoOriginal;
        double percentualDeDesconto = 0.10;

        precoOriginal = 170.30;

        double precoComDesconto = precoOriginal - (precoOriginal * percentualDeDesconto);

        System.out.println("""
                +---------------------------------+
                |------ PROMOÇÃO IMPERDIVEL ------|
                |------     Era %.2f      ------|
                |------  Agora é só %.2f  ------|
                |-- PROMOÇÃO POR TEMPO LIMITADO --|
                +---------------------------------+
                """.formatted(precoOriginal,precoComDesconto));
    }


}
