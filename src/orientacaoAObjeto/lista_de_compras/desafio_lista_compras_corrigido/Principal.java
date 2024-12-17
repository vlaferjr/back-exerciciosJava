package orientacaoAObjeto.lista_de_compras.desafio_lista_compras_corrigido;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //introdução do limite
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        //atribuindo o limite ao cartão
        CartaoCredito cartao = new CartaoCredito(limite);

        /*looping para compra*/
        int sair = 1; //para sair digitar 1
        //enquanto sair for diferente de 0
        while (sair != 0){
            //inserção da descrição
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.nextLine();
            //inserção do valor
            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            //atribuição da compra
            //passa descrção e valor para a classe Compra
            Compra compra = new Compra(descricao, valor);

            //envia para o método lancarCompra para saber se pode ou não comprar
            boolean compraRealizada = cartao.lancarCompras(compra);

            /*Verificar se compra foi realizada*/
            if(compraRealizada){
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                //usuario digita 0 ou 1
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                //sai da aplicação
                sair = 0;
            }

            /*Ordenar a lista de compras*/
            Collections.sort(cartao.getListaCompras());

            /*Impressão das compras realizadas*/

            //para cada item da Compra (c)
            for (Compra c : cartao.getListaCompras()){
                //imprimir a descrição e valor da compra
                System.out.println(c.getDescricao() + "-" + c.getValor());
            }
            System.out.println("-------------------------------");
            //imprimir o sando do Cartão
            System.out.println("Saldo do cartão: " + cartao.getSaldo());

        }

    }
}
