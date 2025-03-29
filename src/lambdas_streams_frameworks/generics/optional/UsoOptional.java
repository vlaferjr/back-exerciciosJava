package lambdas_streams_frameworks.generics.optional;

import java.util.Optional;

public class UsoOptional {
    public static void main(String[] args) {
        //declaração do objeto pessoa
        Pessoa pessoa = new Pessoa("");
        pessoa.setNome("João");
        System.out.println("O nome da pessoa é: " + pessoa.getNome().orElse("Nome não disponível"));
    }
}
