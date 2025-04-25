package victor.exercicios.praticando;

import java.util.Scanner;

public class AcessoSistemas {
    public static void main(String[] args) {
        int codigo;
        int nivel;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o codigo de acesso: ");
        codigo=scanner.nextInt();
        System.out.println("Informe o nivel de acesso: ");
        nivel=scanner.nextInt();

        boolean validacaoCodigo = codigo == 2023;
        boolean validacaoNivel = nivel > 0 && nivel < 4;

        if(validacaoCodigo && validacaoNivel){
            System.out.println("Acesso permitido :)");
        }else{
            System.out.println("Acesso negado :(");
            if(!validacaoCodigo){
                System.out.println("Codigo informado está incorreto");
            }
            if(!validacaoNivel){
                System.out.println("Nivel informado está incorreto ");
            }
        }
    }
}
