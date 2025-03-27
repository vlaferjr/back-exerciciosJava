package lambdas_streams_frameworks.generics.stream;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

// ------------------------- Método Construtor
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // ------------------------- Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    // ------------------------- Método ToString

    @Override
    public String toString() {
        return "Nome: " + nome + ", preco: " + preco + ", categoria: " + categoria;
    }
}
