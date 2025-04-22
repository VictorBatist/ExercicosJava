package victor.exercicios.modulo0;

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
