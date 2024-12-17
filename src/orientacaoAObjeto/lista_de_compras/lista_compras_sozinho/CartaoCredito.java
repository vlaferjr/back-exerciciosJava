package orientacaoAObjeto.lista_de_compras.lista_compras_sozinho;

public class CartaoCredito {
    //atributos
    private double limitePermitido;
    private double saldo;

    //----------------------- Construtor
    public CartaoCredito(double limitePermitido, double saldo) {
        this.limitePermitido = limitePermitido;
        this.saldo = saldo;
    }

    //-----------------getters e setters
    public double getLimitePermitido() {
        return limitePermitido;
    }
    public void setLimitePermitido(double limitePermitido) {
        this.limitePermitido = limitePermitido;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //---------------------- atribui o limite ao saldo
    public double atribuiSaldo(){
        saldo = limitePermitido;
        return saldo;
    }

    //----------------------- verifica saldo
    public boolean verificaSaldo(double valor){
        if(saldo >= valor){
            return true;
        } return false;
    }

    //---------------------- Atualiza saldo
    public double atualizaSaldo(double valor){
        saldo = saldo - valor;
        return saldo;
    }
}
