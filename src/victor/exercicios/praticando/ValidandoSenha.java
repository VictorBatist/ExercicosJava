package victor.exercicios.praticando;

import java.util.Scanner;

public class ValidandoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = 123456;
        int cont = 1;


        do{
            System.out.println("Informe a senha para acessar o arquivo");
            int userPassword = scanner.nextInt();

            if (userPassword == password){
                System.out.println("Acesso liberado!");
                cont = 3;
            }else{
                System.out.println("Acesso Negado");
                System.out.println("Por gentileza, informe a senha novamente");
                cont++;
            }
        }while (cont<3);


    }
}
