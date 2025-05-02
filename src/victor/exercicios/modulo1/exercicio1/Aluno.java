package victor.exercicios.modulo1.exercicio1;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes(){
        System.out.println("""
                Aluno: %s
                Idade: %d
                """.formatted(nome,idade));
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome="Joao";
        aluno.idade=15;

        aluno.exibeInformacoes();
    }
}
