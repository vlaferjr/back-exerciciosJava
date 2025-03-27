package lambdas_streams_frameworks.generics.stream;

public class Pessoa {
    String nome;
    int idade;


    // ---------------------- Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // ----------------------- Método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // ----------------------- Método ToString

    @Override
    public String toString() {
        return "nome:" + nome + ", idade:" + idade;
    }
}

