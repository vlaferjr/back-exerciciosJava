package lambdas_streams_frameworks.generics.streams_avancados;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ExemplosStreamAvancados {
    public static void main(String[] args) {
        // --------------------- Streams Infinitos
        System.out.println("------------------------- STREAMS INFINITOS ----------------------------");
        //iterar de 1 em 1
        Stream.iterate(0, n -> n + 1)
                //ir até 50
                .limit(10)
                //imprimir os números
                .forEach(System.out::println);

        // --------------------- FlatMap
        System.out.println("------------------------- FLAT MAP ----------------------------");
        //3 listas dentro de uma lista
        List<List<String>> listasLetras = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );
        //impressão das listas sem flatMap
        System.out.println("Listas sem o flatMap: " + listasLetras);
        //unificando as 3 listas
        List<String> listaUnificada = listasLetras.stream()
                //coletando cada letra das 3 listaas em uma única
                .flatMap(letra -> letra.stream())
                                //colocando numa nova lista
                                .collect(Collectors.toList());
        //imprimindo nova lista
        System.out.println("Lista com flatMap: " + listaUnificada);
    }
}
