package revisao_2025.desafioMusicas.modelos;

public class Musica extends Audio{
    //declaração de variáveis
    private String album;
    private String artista;
    private String genero;

    //getters e setters

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //método classificação reescrito de Audio
    @Override
    public int getClassificacao() {
        //se tiver com mais de 1500 repetições terá nota 9, senão nota 5
        if (this.getTotalReproducoes() > 1500){
            return 9;
        } else {
            return 5;
        }
    }
}
