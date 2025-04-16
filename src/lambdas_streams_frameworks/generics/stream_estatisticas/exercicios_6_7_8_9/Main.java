package lambdas_streams_frameworks.generics.stream_estatisticas.exercicios_6_7_8_9;

import com.google.gson.internal.bind.util.ISO8601Utils;

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
                //filtrando produtos eletrônicos
                .filter(produto -> produto.getCategoria().equals("Eletrônicos"))
                //filtrando produtos menores que 1000
                .filter(produto -> produto.getPreco() < 1000)
                //colocando em ordem do mais barato para o mais caro
                .sorted(Comparator.comparing(Produto::getPreco))
                //coletando numa lista
                .collect(Collectors.toList());
        //imprimindo produtosEletrônicos
        System.out.println(produtosEletronicos);

        System.out.println("\n------------ PRODUTOS AGRUPADOS POR CATEGORIA ------------");
        //convertendo para String List<Produto>
        Map<String, List<Produto>> produtosAgrupados = produtos.stream()
                //Agrupando produtos por categoria
                .collect(Collectors.groupingBy(Produto::getCategoria));
        //imprimindo produtos por categoria
        System.out.println(produtosAgrupados);


        System.out.println("------------ QTDE DE PRODUTOS POR CATEGORIA ------------");
        //convertendo para String os Longs
        Map<String, Long> qtdeProdutosCategoria = produtos.stream()
                //agrupando por categoria e contando os produtos por categoria
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        //imprimindo produtos por categoria
        System.out.println(qtdeProdutosCategoria);

        System.out.println("------------ PRODUTOS MAIS CAROS POR CATEGORIA ------------");
        //convertendo para String um Otional<Produtos>
        Map<String, Optional<Produto>> produtoMaisCaro = produtos.stream()
                //agrupando os produtos por categoria e comparando qual maior (maxBy) preço por categoria
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.maxBy(Comparator.comparing(Produto::getPreco))));
        //imprimindo os produtos mais caros
        System.out.println(produtoMaisCaro);

        System.out.println("------------ SOMA DOS PREÇOS POR CATEGORIA ------------");
        //convertendo para String o Double
        Map<String, Double> somaPorCategoria = produtos.stream()
                //agrupando os produtos por categoria e somando os preços dos produtos por categoria
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.summingDouble(Produto::getPreco)));
        //imprimindo a categoria com a soma dos preços
        System.out.println(somaPorCategoria);

    }
}
