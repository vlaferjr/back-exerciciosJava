package revisao_2025.desafioMusicas.modelos;

public class Preferidas {
    public void incluirRreferidas(Audio audio){
        if (audio.getClassificacao() >= 7){
            System.out.println("audio: " + audio.getTitulo() + ": é Sucesso!!!! =)");
        } else {
            System.out.println("audio: " + audio.getTitulo() + ": Ainda pode estourar! =(");
        }
    }
}
