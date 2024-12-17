package orientacaoAObjeto.lista_de_compras.desafio_lista_compras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //lendo o limite do cartão
        System.out.println("--------INFORME O LIMITE DO SEU CARTÃO --------------");
        Scanner leitura = new Scanner(System.in);

        //declaração do limite
        double limite = leitura.nextDouble();

        //opção do menu
        int opcaoMenu = 0;

        //declaração da lista de compras
        List<Compras> listaCompras = new ArrayList<>();

        //variável para somar os preços
        double somaPrecos = 0;

        //variável saldo
        double saldo = limite;

        do {
            //opção de menu
            System.out.println("Digite 1 para continuar comprando e ou 0 para sair");
            opcaoMenu = leitura.nextInt();

            if (opcaoMenu == 1) {
                if (saldo > 0) {
                    //criação do objeto compra
                    Compras compra = new Compras();

                    System.out.println("Digite a descrição do produto: ");
                    compra.setDescricao(leitura.next());

                    System.out.println("Digite o valor do produto: ");
                    compra.setValor(leitura.nextDouble());

                    //adicionando compra a lista de compras
                    listaCompras.add(compra);

                    //somando os preços
                    somaPrecos += compra.getValor();

                    //atualiza saldo
                    saldo = limite - somaPrecos;

                    //listando as compras
                    listaCompras.forEach(produto ->{
                        System.out.println(produto.getDescricao() + ":" + produto.getValor());
                    });

                    //informando o saldo
                    System.out.println("Seu saldo é de: " + saldo);
                } else{
                    System.out.println("Saldo Insuficiente");
                    break;
                }
            }
        } while (opcaoMenu == 1);

        //ordenação da lista por valor
        listaCompras.sort(Comparator.comparing(Compras::getValor));

        //impressão da lista de compras
        System.out.println("Os itens comprados foram: " );

        //imprimindo a lista de compras
        listaCompras.forEach(produto ->{
            System.out.println(produto.getDescricao() + ":" + produto.getValor());
        });
    }
}
