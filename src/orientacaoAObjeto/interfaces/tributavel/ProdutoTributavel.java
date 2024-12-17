package orientacaoAObjeto.interfaces.tributavel;

//classe que implementa método da interface Tributável
public class ProdutoTributavel implements Tributavel{

    private String nome;
    private double valor;

    //método que vem implementado da classe Tributável
    @Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }
}
