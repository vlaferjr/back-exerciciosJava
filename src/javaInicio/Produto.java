package javaInicio;

public class Produto {

    String nome;
    double preco;
    double descontoPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        double precoFinal;
        if (pagamentoViaPix) {
            precoFinal = preco - descontoPix;
        } else {
            precoFinal = preco;
        }
        return precoFinal;
    }
}