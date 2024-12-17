package orientacaoAObjeto.herança.contabancaria;

public class Conta {

     /*Atributos da conta*/
    private String titular;
    private double saldo;

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("O valor deve ser maior do que zero para ser sacado");
        } else if(saldo >= valor){
            saldo = saldo - valor; //ou saldo-= valor
            System.out.println("Saque realizado com sucesso!\n Seu saldo é de: " + saldo);
        } else{
            System.out.println("Saldo Insuficiente!\n Seu saldo é de: " + saldo);
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! \n Seu saldo é de: "+saldo );
        } else{
            System.out.println("Valor deve ser maior do que Zero para poder depositar");
        }
    }

    //getters e setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
