package lambdas_streams_frameworks.generics.optional;

import java.util.Optional;

public class Pessoa {
    private String nome;

    //método Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Getters e Setters
    public Optional<String> getNome() {
        return Optional.ofNullable(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
