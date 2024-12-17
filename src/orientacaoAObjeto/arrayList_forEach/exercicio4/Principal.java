package orientacaoAObjeto.arrayList_forEach.exercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //declaração dos produtos
        Produto p1 = new Produto();
        p1.setNome("Bola");
        p1.setPreco(89.99);

        Produto p2 = new Produto();
        p2.setNome("Luva de goleiro");
        p2.setPreco(45.99);

        Produto p3 = new Produto();
        p3.setNome("Camisa Palmeiras");
        p3.setPreco(299.99);

        //criando a lista de produtos
        ArrayList<Produto>listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);

        //declaração de uma variável para somar os preços
        final double[] somaPrecos = {0};

        //fazendo um looping para iterar os produtos
        listaDeProdutos.forEach(produto -> {
            System.out.println("Item: " + produto.getNome() + " R$" + produto.getPreco());
            //soma preços vai somando preços dos produtos
            somaPrecos[0] += produto.getPreco();
        });

// Calculando a média e imprimindo os resultados
        if (!listaDeProdutos.isEmpty()) { // se a lista não for vazia
            double mediaPrecos = somaPrecos[0] / listaDeProdutos.size(); //calcula média
            System.out.println("Soma total: R$" + somaPrecos[0]); // imprimir a soma
            System.out.println("O preço médio das compras foi de: R$" + mediaPrecos); //imprimi média
        } else {
            System.out.println("A lista de produtos está vazia."); //lista vazia
        }
    }
}