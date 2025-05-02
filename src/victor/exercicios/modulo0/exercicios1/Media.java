//Crie um programa que realize a média de duas notas decimais e exiba o resultado.

package victor.exercicios.modulo0.exercicios1;

public class Media {
    double nota1;
    double nota2;

    static double media(double nota1, double nota2){
        double resultado = (nota1 + nota2) /2;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(media(8.3,10.5));
    }
}
