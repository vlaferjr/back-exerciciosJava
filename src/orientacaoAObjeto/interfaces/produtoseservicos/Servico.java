package orientacaoAObjeto.interfaces.produtoseservicos;

public class Servico implements Vendavel{
    @Override
    public double precoTotal(double preco, int qtde) {
        double precoFinal;
        precoFinal = preco * qtde;
        return precoFinal;
    }
}
