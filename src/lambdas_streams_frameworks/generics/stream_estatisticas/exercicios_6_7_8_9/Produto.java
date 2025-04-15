package lambdas_streams_frameworks.generics.stream_estatisticas.exercicios_6_7_8_9;

public class Produto {
    //Declaração dos atributos
    private String nome;
    private double preco;
    private String categoria;

    //Construtor
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    //ToString

    @Override
    public String toString() {
        return "nome: " + nome + " - preco: " + preco + " - categoria: " + categoria + "\n";
    }
}
