package orientacaoAObjeto.ordenacaoLista.arrayList_linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //criação da lista com
        List<String> listaDeNomes = new LinkedList<>();

        //adicionando elementos na lista
        listaDeNomes.add("Vanessa");
        listaDeNomes.add("Vlad");
        listaDeNomes.add("Andréia");
        listaDeNomes.add("Adriana");
        listaDeNomes.add("Cristiane");
        listaDeNomes.add("Arlete");

        //ordenando a lista
        Collections.sort(listaDeNomes);

        //Imprimindo a lista
        System.out.println("------ Lista de Nomes -------------- \n" + listaDeNomes);
    }
}
