package orientacaoAObjeto.herança.contabancaria;

public class ContaPoupanca extends Conta{
    /*Atributos da poupança*/
    private double taxaJuros;

    //método para cálculo de Juros
    public void calcularJuros(){
        double juros = this.getSaldo()*taxaJuros;
        System.out.println("Juros atual foi de: " + taxaJuros);
    }

    public void sacar (double valor){
        double taxaSaque = 0.01;
        super.sacar(valor + taxaSaque);
    }

    /*getters e setters*/
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
