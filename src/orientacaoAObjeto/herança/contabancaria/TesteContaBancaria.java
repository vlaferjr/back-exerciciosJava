package orientacaoAObjeto.herança.contabancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        //realizando operações conta Corrente
        ContaCorrente cc = new ContaCorrente();
        //depósito de 500 (método na classe Conta Bancária)
        cc.depositar(500);
        //saque de 200 (método na classe conta bancária)
        cc.sacar(200);
        //cobrança de tarifa (método que está na classe Conta Corrente)
        cc.cobrarTarifaMensal();
    }
}
