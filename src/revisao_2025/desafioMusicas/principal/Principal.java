package revisao_2025.desafioMusicas.principal;

import revisao_2025.desafioMusicas.modelos.Musica;
import revisao_2025.desafioMusicas.modelos.PodCast;
import revisao_2025.desafioMusicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        //música 1
        Musica musica1 = new Musica();
        musica1.setTitulo("Sujeito Homem");
        musica1.setArtista("Guilherme e Benutto");

        //musica 2
        Musica musica2 = new Musica();
        musica2.setTitulo("A Noite");
        musica2.setArtista("Gusttavo Lima");

        //Reproduções de músicas
        for (int i = 0; i <= 100; i++){
            musica1.reproduzir(); //música 1 tocou 1000 vezes
        }

        for (int i = 0; i <= 20; i++){
            musica2.reproduzir(); //musica 2 tocou 2000 vezes
        }

        //continuar instanciando podcast
        PodCast podCast1 = new PodCast();
        podCast1.setTitulo("NerdCast");

        PodCast podCast2 = new PodCast();
        podCast2.setTitulo("Café com Deus Pai");

        //Curtidas do Podcast
        for (int i = 0; i <= 50; i++){
            podCast1.curtir(); //podcast 1 com 5000 curtidas
        }

        for (int i = 0; i <= 300; i++){
            podCast2.curtir(); //podcast 2 com 300 curtidas
        }

        //testar a classificação das músicas
        Preferidas musicaPreferida = new Preferidas();
        musicaPreferida.incluirRreferidas(musica1);
        musicaPreferida.incluirRreferidas(musica2);

        //testar classificação dos podcasts
        Preferidas podcastPreferido = new Preferidas();
        podcastPreferido.incluirRreferidas(podCast1);
        podcastPreferido.incluirRreferidas(podCast2);
    }
}
