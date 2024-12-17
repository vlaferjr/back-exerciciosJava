package orientacaoAObjeto.interfaces.produtoseservicos;

public class Produto implements Vendavel{
    @Override
    public double precoTotal(double preco, int qtde) {
        double precoFinal;
        if(qtde >= 3){
            precoFinal = (preco * qtde);
            return precoFinal - (precoFinal * 0.1);
        }
        precoFinal = (preco * qtde);
        return precoFinal;
    }
}
