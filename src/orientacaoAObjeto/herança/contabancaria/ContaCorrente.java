package orientacaoAObjeto.herança.contabancaria;

public class ContaCorrente extends ContaBancaria{
    //declaração de atributo
    private double tarifaMensal = 3.75;
    //método Cobrar Tarifa
    public void cobrarTarifaMensal(){
        //saldo - tarifa
        double saldo = this.getSaldo() - this.tarifaMensal;
        //impressão da mensagem de tarifa e saldo
        String mensagem = "Tarifa mensal de %.2f cobrada. Saldo de: %.2f".formatted(tarifaMensal,saldo);
        System.out.println(mensagem);
    }
}
