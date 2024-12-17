package orientacaoAObjeto.ordenacaoLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Exercício 1
Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
Em seguida, imprima a lista ordenada.*/
public class NumerosInteiros {
    public static void main(String[] args) {
        //declarando lista de números
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(1);
        listaDeNumeros.add(5);
        listaDeNumeros.add(2);
        listaDeNumeros.add(0);
        listaDeNumeros.add(7);
        listaDeNumeros.add(4);
        listaDeNumeros.add(8);

        //ordenando a lista
        Collections.sort(listaDeNumeros);

        //imprimindo a lista ordenada
        System.out.println(" ---------- LISTA ORDENADA --------------- \n" + listaDeNumeros );
    }
}
