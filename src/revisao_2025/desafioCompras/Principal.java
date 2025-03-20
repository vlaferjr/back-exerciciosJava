package revisao_2025.desafioCompras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //----- Declaração das variáveis
        Scanner leitura = new Scanner(System.in);

        CartaoCredito cartaoCredito = new CartaoCredito();

        final double[] totalCompras = {0};

        double saldoCartao = 0;

        ArrayList <Compras> listaCompras = new ArrayList<>();

        int opcaoMenu = 0;

        //---------------------------------Leitura dos itens

        System.out.println("Digite o limite do cartão de crédito: ");
        cartaoCredito.setLimite(leitura.nextDouble());

        saldoCartao = cartaoCredito.getLimite();

        //fazer um menu para continuar comprando
        System.out.println("Digite: \n" +
                "0 - Sair \n" +
                "1 - Continuar comprando");
        opcaoMenu = leitura.nextInt();

        while (opcaoMenu != 0) {

            //criando novo produto para cada iteração
            Compras produto = new Compras();

            System.out.println("Digite o produto a ser comprado: ");
            leitura.nextLine();
            produto.setDescricao(leitura.nextLine());

            System.out.println("Digite o valor do produto");
            produto.setValor(leitura.nextDouble());

            if (saldoCartao >= produto.getValor()){

                System.out.println("COMPRA REALIZADA COM SUCESSO!!!");

                listaCompras.add(produto);

                totalCompras[0] += produto.getValor();

                saldoCartao -= produto.getValor();

                System.out.println("\n Você ainda tem: R$ " + saldoCartao);

            } else {
                System.out.println("SALDO INSUFICIENTE PARA A COMPRA!!!");
            }

            //------- Ordenação da lista
            listaCompras.sort(Comparator.comparing(Compras::getValor));

            //----------- Lista de compras
            //iterar a lista de produtos pelo looping para somar os preços
            System.out.println("\n\n********************* LISTA DE COMPRAS ************************");
            listaCompras.forEach(item -> {
                System.out.println("Item: " + item.getDescricao() + " R$" + item.getValor());
            });

            System.out.println("\nTotal Gasto das compras: R$ " + totalCompras[0]);

            System.out.println("\n Digite: \n" +
                    "0 - Sair \n" +
                    "1 - Continuar comprando");

            opcaoMenu = leitura.nextInt();
        }

    }
}
