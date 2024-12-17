package orientacaoAObjeto.interfaces.precofinal;

public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double descontoEscritor = 0.1;
        double lucro = 0.2;
        return preco + (preco * lucro) - (preco * descontoEscritor);
    }
}
