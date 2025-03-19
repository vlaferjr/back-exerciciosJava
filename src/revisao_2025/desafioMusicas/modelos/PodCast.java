package revisao_2025.desafioMusicas.modelos;

public class PodCast extends Audio{

    //declaração de variáveis
    private String host;
    private String descricao;

    //getters e setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //método Classificação
    @Override
    public int getClassificacao() {
        //se tiver com mais de 1500 curtidas terá nota 9, senão nota 5
        if (this.getCurtidas() > 1500 ){
            return 9;
        } else {
            return 5;
        }
    }
}
