package orientacaoAObjeto.lista_de_compras.lista_compras_sozinho;

public class Compras implements Comparable{
    //atributos
    private String descricao;
    private double valor;

    //Construtor
    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

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

    //---------------------- ToString
    @Override
    public String toString() {
        return  "Produto: " + descricao + " | " +
                "Valor: " + valor;
    }
    //------------------- método ComparaTo da interface Comparable (poder ordenar lista por valor)
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
