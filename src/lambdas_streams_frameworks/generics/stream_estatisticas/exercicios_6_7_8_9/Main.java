package lambdas_streams_frameworks.generics.stream_estatisticas.exercicios_6_7_8_9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        System.out.println("------------ PRODUTOS ELETRÔNICOS, DO BARATO AO CARO ------------");
        List<Produto> produtosEletronicos = produtos.stream()
                .filter(produto -> produto.getCategoria().equals("Eletrônicos"))
                .filter(produto -> produto.getPreco() < 1000)
                .sorted(Comparator.comparing(Produto::getPreco))
                .collect(Collectors.toList());

        System.out.println(produtosEletronicos);

        System.out.println("\n------------ PRODUTOS AGRUPADOS POR CATEGORIA ------------");
        Map<String, List<Produto>> produtosAgrupados = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(produtosAgrupados);


        System.out.println("------------ QTDE DE PRODUTOS POR CATEGORIA ------------");
        Map<String, Long> qtdeProdutosCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        System.out.println(qtdeProdutosCategoria);

        /*System.out.println("------------ PRODUTOS MAIS CAROS POR CATEGORIA ------------");
        Map<String, Optional<Produto>> produtoMaisCaro = produtos.stream()
                .map(produto -> produto.getPreco()).reduce(Double::max)
                .stream().collect(Collectors.toCollection())*/
    }
}
