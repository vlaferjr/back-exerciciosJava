package orientacaoAObjeto.herança.contabancaria;

public class ContaBancaria {
    //declaração de atributos
    private double saldo;

    //getters e setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //método depositar
    public double depositar(double valor){
        if (valor<0){
            String mensagem = "O valor tem que ser maior do que zero para poder ser depositado";
            System.out.println(mensagem);
        } else {
            this.saldo = saldo + valor;
            String mensagem = "Depósito feito! Novo Saldo: %.2f".formatted(saldo);
            System.out.println(mensagem);
        }
        return saldo;
    }
    //método sacar
    public double sacar (double valor){
        if(valor>saldo){
            String mensagem = "Saldo insuficiente para sacar %.2f, seu saldo é de: %.2f".formatted(valor,saldo);
            System.out.println(mensagem);
        } else {
            this.saldo = saldo - valor;
            String mensagem = "Saque realizado com Sucesso\n Seu novo saldo é de: %.2f".formatted(saldo);
            System.out.println(mensagem);
        }
        return saldo;
    }
    //método consultar saldo
    public void consultarSaldo (){
        String mensagem = "Seu saldo é de: %.2f".formatted(saldo);
        System.out.println(mensagem);
    }
}
