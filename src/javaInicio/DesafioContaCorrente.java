package javaInicio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioContaCorrente {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //dados do cliente
        System.out.println("Digite seu nome:");
        String nome = leitura.nextLine();
        int opcaoTipoConta = 0;
        String tipoConta = "";
        double saldoInicial = 0;
        String mensagem;
        String mensagemMenu;
        int opcaoMenu = 0;
        double valorRetirado = 0;
        double valorDepositado = 0;
        double saldo = saldoInicial + valorDepositado - valorRetirado;

        System.out.println("Qual Tipo de conta desejado? \n 1 - Conta Corrente \n 2- Conta Poupança");
        opcaoTipoConta = leitura.nextInt();

        if(opcaoTipoConta == 1){
            tipoConta = "Conta Corrente";
        } else if (opcaoTipoConta == 2) {
            tipoConta = "Conta Poupança";
        }
        mensagem = """
                *************************************************************
                * Nome completo: %s                                         
                * Tipo de Conta: %s                                                       
                * Saldo Inicial: R$ %.2f                                    
                *************************************************************
                """.formatted(nome, tipoConta, saldoInicial);

        System.out.println(mensagem);

        while (opcaoMenu != 4){
            //menu
            mensagemMenu = """
                
                
                O que deseja fazer?
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;
            System.out.println(mensagemMenu);
            opcaoMenu = leitura.nextInt();
            switch (opcaoMenu){
                //para verificar o saldo
                case 1:
                    System.out.println("******************** SALDO ********************");
                    System.out.println("Seu saldo disponível é: %.2f".formatted(saldo));
                    break;
                case 2: //receber valor
                    System.out.println("******************** RECEBER VALOR ********************");
                    System.out.println("Indique o valor a ser recebido: ");
                    valorDepositado = leitura.nextDouble();
                    saldo = saldo + valorDepositado; //ou saldo += valorDepositado;
                    System.out.println("Seu saldo disponível é: %.2f".formatted(saldo));
                    break;
                case 3: //retirar valor
                    System.out.println("******************** TRANSFERIR VALOR ********************");
                    System.out.println("Indique o valor a ser retirado: ");
                    valorRetirado = leitura.nextDouble();
                    //verifica se tem saldo
                    if(valorRetirado >= saldo){
                        System.out.println("Seu saldo é de: %2f! Saldo Insificiente!".formatted(saldo));
                    } else {
                        saldo = saldo - valorRetirado; //ou saldo -= valorRetirado;
                        System.out.println("Seu saldo disponível é: %.2f".formatted(saldo));
                    }
                    break;
                default:
                    if(opcaoMenu != 4 ){
                    System.out.println("Oção Inválida");
                    }
                    break;

            }
        }
    }
}
