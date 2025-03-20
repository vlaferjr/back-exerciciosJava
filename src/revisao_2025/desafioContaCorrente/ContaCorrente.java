package revisao_2025.desafioContaCorrente;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = leitura.nextLine();

        System.out.println("Escolha:\n 1 - Conta Corrente \n 2 - Conta Poupança: ");
        int opcaotipoConta = leitura.nextInt();

        System.out.println("Digite o saldo inicial do cliente:");
        double saldo = leitura.nextDouble();

        String tipoConta = null;

        if(opcaotipoConta == 1){
            tipoConta = "Conta Corrente";
        } else if (opcaotipoConta ==2) {
            tipoConta = "Conta Poupança";
        }

        //Impressão dos dados
        String mensagem = """
                ************************************************
                DADOS INICIAIS
                
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
            
                ************************************************
                """.formatted(nome, tipoConta, saldo);
        System.out.println(mensagem);

        // Menu de opções
        System.out.println("Escolha o que deseja fazer:\n " +
                "1 - Consultar saldo \n" +
                "2 - Receber valor \n" +
                "3 - Transferir valor \n" +
                "4 - Sair");

        int opcaoMenu = leitura.nextInt();

        double valor = 0;

        switch (opcaoMenu) {
            case 1:
                System.out.println("************ SALDO ***************");
                System.out.println("Saldo: " + saldo);
                break;
            case 2:
                System.out.println("************ RECEBER VALOR ***************");
                System.out.println("Digite o valor a ser recebido:");
                valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Seu saldo é de: " + saldo);
                break;
            case 3:
                System.out.println("************ TRANSFERIR VALOR ***************");
                System.out.println("Digite o valor a ser transferido:");
                valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - valor;
                }
                System.out.println("Seu saldo é de: " + saldo);
                break;
            default:
                if(opcaoMenu != 4){
                    System.out.println("Opção inválida");
                }
        }
    }
}
