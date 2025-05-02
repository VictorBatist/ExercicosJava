//Declare uma variável do tipo double e uma variável do tipo int.
//Faça o casting da variável double para int e imprima o resultado.

package victor.exercicios.modulo0.exercicio1;

public class Casting {

    public static void main(String[] args) {
        double numeroReal;
        int numeroInteiro;

        numeroReal = 3.14;
        numeroInteiro = (int)numeroReal;

        System.out.println(numeroInteiro);
    }
}
