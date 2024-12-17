package orientacaoAObjeto.lista_de_compras.desafio_lista_compras;

public class Compras implements Comparable{
    //declaração dos atributos
    private String descricao;
    private double valor;

    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //ToString para imprimir corretamente
    @Override
    public String toString() {
        return  "\n Descrição: " + this.getDescricao() + "| Valor: R$ " + this.getValor();
    }
    //Comparação para fazer a ordenação pelo valor
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
