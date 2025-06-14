/*Crie uma classe Musica com atributos titulo, artista,
anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
avaliar a música e calcular a média de avaliações.*/

package victor.exercicios.modulo1.exercicio1;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    int avaliacao;
    int numeroDeAvaliacoes;
    int somaAvaliacao;

    void fichaTecnica(){
        System.out.println("""
                Titulo: %s
                Artista: %s
                Ano de lançamento da musica: %d
                Avaliação: %d
                Quantidade de Avaliações: %d
                """.formatted(titulo, artista, anoDeLancamento, avaliacao, numeroDeAvaliacoes));
    }

    void avaliarMusica(int valor){
        if(valor>= 4){
            System.out.println("Muito bom!");
        }else if(valor<4 && valor>=2){
            System.out.println("Regular..");
        }else {
            System.out.println("Ruim.");
        }
        somaAvaliacao = somaAvaliacao + valor;
        numeroDeAvaliacoes++;
    }

    int mediaDeAvaliacoes(){
        return somaAvaliacao/numeroDeAvaliacoes;
    }
}
