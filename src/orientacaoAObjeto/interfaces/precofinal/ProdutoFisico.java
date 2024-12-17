package orientacaoAObjeto.interfaces.precofinal;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double icms = 0.12;
        double cofins = 0.0365;
        double lucro = 0.30;
        return preco + (preco * lucro) - (preco * icms * cofins);
    }
}
