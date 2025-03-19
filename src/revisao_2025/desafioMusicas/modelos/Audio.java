package revisao_2025.desafioMusicas.modelos;

public class Audio {
    //declaração de variáveis
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    //métodos
    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }
}
