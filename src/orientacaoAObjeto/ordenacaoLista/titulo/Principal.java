package orientacaoAObjeto.ordenacaoLista.titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //declaração dos objetos Título
        Titulo livro = new Titulo();
        Titulo musica = new Titulo();
        Titulo filme = new Titulo();
        Titulo serie = new Titulo();

        //setando os objetos pelo nome
        livro.setNome("O Pequeno Príncipe");
        musica.setNome("Ai se eu te Pego");
        filme.setNome("O poderoso chefão");
        serie.setNome("La Casa de Papel");

        //declaração da lista de músicas
        List<Titulo> listaDeTitulos = new ArrayList<>();

        //adicionando os objetos na lista
        listaDeTitulos.add(livro);
        listaDeTitulos.add(musica);
        listaDeTitulos.add(filme);
        listaDeTitulos.add(serie);

        //ordenação de lista
        listaDeTitulos.sort(Comparator.comparing(Titulo::getNome));

        //impressão da lista ordenada
        System.out.println("-------------- Lista de Títulos --------------- \n " + listaDeTitulos);
    }
}
