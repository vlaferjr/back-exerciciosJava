package orientacaoAObjeto.construtor.produto;

public class ProdutoPerecivel extends Produto{

    private String dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
