package orientacaoAObjeto.arrayList_forEach.exercicio6;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //criando os objetos Conta Bancária
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();

        //setando as contas
        conta1.setNumeroConta("123");
        conta1.setSaldo(3000);
        conta2.setNumeroConta("456");
        conta2.setSaldo(2000);
        conta3.setNumeroConta("789");
        conta3.setSaldo(1000);

        //criando uma lista de contas
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        //adicionando contas na lista
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        //Definindo conta com maior Saldo
        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);

        // Fazendo o for para percorrer as contas
        for (ContaBancaria contaBancaria : listaDeContas) {
            //comparando se conta bancária é maior que conta com maior saldo
            if (contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()) {
                //conta com maior saldo recebe a conta bancário definida no if acima
                contaMaiorSaldo = contaBancaria;
            }
        }
        System.out.println("A conta com maior saldo é a conta " + contaMaiorSaldo.getNumeroConta() + " com saldo de: " + contaMaiorSaldo.getSaldo());
    }
}
