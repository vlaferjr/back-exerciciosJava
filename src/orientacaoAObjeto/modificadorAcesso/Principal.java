package orientacaoAObjeto.modificadorAcesso;

public class Principal {

    public static void main(String[] args) {
        PublicConta c1 = new PublicConta();
        c1.saldo = 300;
        c1.sacar(100);

        //acesso à conta private
        PrivateConta p1 = new PrivateConta();
        p1.saldo= 300;
        p1.sacar(100);
    }


}
