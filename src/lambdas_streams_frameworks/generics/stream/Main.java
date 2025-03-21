package lambdas_streams_frameworks.generics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

// ----------------------------- Filtrando números pares
        System.out.println("************* IMPRESSÃO DE LISTA DE NÚMEROS PARES *****************");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //filtragem
        numeros.stream()
                //filtrando os números pares
                .filter(numero -> numero % 2 == 0)
                //iterando sobre os números das codições acima
                .forEach(numero -> System.out.println(numero));

// ------------------------------ Transformando em maiúsculas
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PALAVRAS MAIÚSCULAS *****************");
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream()
                .forEach(palavra -> System.out.println(palavra.toUpperCase()));

// ------------------------------ Números ímpares multiplicados por 2
        System.out.println("\n************* IMPRESSÃO DE LISTA DE NÚMEROS ÍMPARES * 2 *****************");
        //aproveitando a lista do exercício 1
        //List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numerosImpares =
        numeros.stream()
                //filtrando os números ímpares
                .filter(numero -> !(numero % 2 == 0))
                //usando o map para converter os números multiplicando por 2
                .map(numero -> numero * 2)
                //coletando numa nova lista
                .collect(Collectors.toList());
        //imprimindo a nova lista
        System.out.println(numerosImpares);

// ------------------------------ Removendo duplicatas
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PALAVRAS SEM DUPLICIDADE *****************");
        //lista de palavras
        List<String> listaPalavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        //lista de palavras sem duplicatas (.distinct)
        listaPalavras.stream().distinct()
                //impressão da lista de palavras sem duplicatas
                .forEach(palavra -> System.out.println(palavra));

    }
}
