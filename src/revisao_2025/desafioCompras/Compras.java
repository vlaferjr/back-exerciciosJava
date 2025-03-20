package revisao_2025.desafioCompras;

public class Compras implements Comparable{
    private String descricao;

    private double valor;

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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
