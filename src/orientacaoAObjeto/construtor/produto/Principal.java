package orientacaoAObjeto.construtor.produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //declaração do produto 1 já passando os parâmetros que o construtor pede
        Produto prod1 = new Produto("bola",45.99,2);
        //declaração do produto 2
        Produto prod2 = new Produto("camiseta",149.99,5);
        //declaração do Produto 3
        Produto prod3 = new Produto("Boné",79.99,3);


        //declaração da lista de Produtos
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        //adicionando produtos na lista
        listaDeProdutos.add(prod1);
        listaDeProdutos.add(prod2);
        listaDeProdutos.add(prod3);

        //imprimindo tamanho da lista
        System.out.println("A lista tem: " + listaDeProdutos.size() + " itens\n");

        //pegando um produto qualquer pelo índice
        System.out.println("O produto " + listaDeProdutos.get(1) + " é um (a) " + listaDeProdutos.get(0).getNome());

        //imprimindo a lista inteira de produtos
        System.out.println("\n******* LISTA DE PRODUTOS ***********");
        System.out.println(listaDeProdutos);

        //declaração de Produto Perecível
        ProdutoPerecivel prodPerecivel = new ProdutoPerecivel("Leite",4.99,10,"12/10/2024");

        //impressão de produto Perecível
        System.out.println("\n O produto perecível cadastrado foi: " + prodPerecivel.getNome());
    }
}
