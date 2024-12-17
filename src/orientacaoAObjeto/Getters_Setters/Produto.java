package orientacaoAObjeto.Getters_Setters;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public double aplicarDesconto (double valorPercentual){
        return this.precoProduto - this.precoProduto * valorPercentual;
    }
}
