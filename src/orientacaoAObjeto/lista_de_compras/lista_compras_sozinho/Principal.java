package orientacaoAObjeto.lista_de_compras.lista_compras_sozinho;

import orientacaoAObjeto.lista_de_compras.desafio_lista_compras_corrigido.Compra;

import java.sql.SQLOutput;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //variável leitura para receber os valores
        Scanner leitura = new Scanner(System.in);
        //lendo limite
        System.out.println("Digite o limite permitido");
        CartaoCredito cartao = new CartaoCredito(leitura.nextDouble(),0);

        //impressão do limite
        System.out.println("O Limite inicial do seu cartão é de: " + cartao.atribuiSaldo());

        //Definindo menu
        int opcaoMenu = 0;

        //criar lista de compras
        ArrayList<Compras> listaDeCompras = new ArrayList<>();

        do {
            System.out.println("Pressione 0 para continuar ou 1 para sair");
            opcaoMenu = leitura.nextInt();

            if(opcaoMenu != 1){
                //comprando

                System.out.println("Digite o valor da compra");
                double valor = leitura.nextDouble();

                //ler a quebra para não trazer a descrição como ""
                leitura.nextLine();

                System.out.println("Digite a descrição da compra");
                String descricao = leitura.nextLine();

                // Consumir a quebra de linha restante
                leitura.nextLine();

                //Criando o objeto Compra
                //compra recebendo descrição e valor digitado
                Compras compra = new Compras(descricao, valor);

                boolean compraAprovada = cartao.verificaSaldo(compra.getValor());

                if (compraAprovada) {
                    //adiciona compra na lista
                    listaDeCompras.add(compra);

                    //ordena as compras por ordem de valor
                    listaDeCompras.sort(Comparator.comparing(Compras::getValor));

                    //imprime lista de compras
                    System.out.println("--------------------- Compra realizada------------------------\n");
                    System.out.println("---------------- LISTA DE COMPRAS ATÉ O MOMENTO-------------------- \n");
                    //iterando a lista de compras
                    listaDeCompras.forEach(compras -> {
                        System.out.println(compras);
                    });
                    System.out.println("Seu saldo é de: " + cartao.atualizaSaldo(compra.getValor()));
                } else {
                    System.out.println("Compra Recusada \n" +
                            "seu saldo é de: " + cartao.getSaldo());
                    opcaoMenu = 1;
                }
            }
        } while (opcaoMenu != 1);

    }
}
