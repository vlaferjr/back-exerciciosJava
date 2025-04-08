package lambdas_streams_frameworks.generics.stream_estatisticas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        /*1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.*/
        System.out.println("------------------------- MAIOR NUMERO DA LISTA ----------------------------");

        List<Integer> numeros = Arrays.asList(30,20,50,10,40,5);
        //maior numero da lista com reduce
        System.out.println("O maior número da lista (usando reduce) é: " + numeros.stream().reduce(Integer::max));

        //maior número da lista sem usar reduce
        IntSummaryStatistics estatisticasNumeros = numeros.stream()
                //convertendo para inteiros
                .mapToInt(Integer::intValue)
                //colocando os números nas estatísticas
                .summaryStatistics();
        //imprimindo as estatísticas
        System.out.println("O maior número da lista (sem reduce) é: " + estatisticasNumeros.getMax());

        /*2 -Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.
        No código a seguir, há um exemplo prático do resultado esperado.*/
        System.out.println("------------------------- MAIOR NUMERO DA LISTA ----------------------------");
    }

}
