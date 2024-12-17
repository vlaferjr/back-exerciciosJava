package orientacaoAObjeto.modificadorAcesso.defaultConta.teste;
import orientacaoAObjeto.modificadorAcesso.defaultConta.conta.Conta;
public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }
}
