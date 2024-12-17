package orientacaoAObjeto.lista_de_compras.desafio_lista_compras_corrigido;

public class Compra implements Comparable<Compra>{
    /*Atributos*/
    private String descricao;
    private double valor;

    /*Construtor*/
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    /*Getters*/
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }

    /* Método ToString*/
    @Override
    public String toString() {
        return "\nNova Compra: descricao='" + descricao + ", valor=" + valor;
    }

    /*método do Comparable para comparar*/
    @Override
    public int compareTo(Compra outraCompra) {
        //comparando o valor da minha comra com valor de outra compra para ordenar
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
