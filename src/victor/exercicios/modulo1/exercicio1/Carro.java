package victor.exercicios.modulo1.exercicio1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("""
                Modelo: %s
                Ano: %d
                Cor: %s
                """);
    }

    int calcularIdade(int ano){
        return 2025 - ano;
    }
}
