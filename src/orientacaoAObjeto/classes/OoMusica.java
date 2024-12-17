package orientacaoAObjeto.classes;

public class OoMusica {
    int numAvaliacoes;
    float avaliacao;
    //Recebendo os parâmetros
    void exibeFichaTecnica(String nome, String cantor, String anoLancamento){
        System.out.println("***************Ficha Técnica *************************");
        System.out.println("Título do Filme: %s".formatted(nome));
        System.out.println("Artista: %s".formatted(cantor));
        System.out.println("Ano de Lançamento: %s".formatted(anoLancamento));
    }
    //recebendo nota como parâmetro
    void  avaliaMusica(float nota){
        this.avaliacao =  avaliacao + nota;
        numAvaliacoes++;

        System.out.println("***************Média das avaliações *************************");
        System.out.println("A média das avaliações é: %f".formatted(avaliacao/numAvaliacoes));
        System.out.println("A quantidade de avaliações é: %d".formatted(numAvaliacoes));
    }
}
