package lambdas_streams_frameworks.generics.stream_estatisticas;

import java.util.*;
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
        System.out.println("\n------------------------- AGRUPAMENTO DE PALAVRAS PELO SEU TAMANHO ----------------------------");
        //lista de palavras
        List<String>palavras = Arrays.asList("java", "stream", "lambda", "code");
        //pegando a lista de string e transformando em inteiro para pegar a qtde de letras
        Map<Integer, List<String>> palavrasAgrupadas = palavras.stream()
                //agrupando pela quantidade de letras
                .collect(Collectors.groupingBy(String::length));
        //imprimindo lista palavras agrupadas
        System.out.println(palavrasAgrupadas);


        /*3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.
        No código a seguir, há um exemplo prático do resultado esperado.*/
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("\n-------------------------NOMES SEPARADOS POR VÍRGULA ----------------------------");
        // Resultado Esperado: "Alice, Bob, Charlie"

        List<String> nomesSeparados = nomes.stream()
                //colocando um espaço entre os nomes
                .map(nome -> nome + "")
                //coletando numa nova lista
                .collect(Collectors.toList());
        System.out.println(nomesSeparados);

        /*---- Resposta do instrutor*/

        String result = nomes.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);

        /*4 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.*/
        System.out.println("\n----------------Soma dos quqadrados dos pares--------------");
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        IntSummaryStatistics resultado = listaNumeros.stream()
                //filtrando os numeros pares
                .filter(numero -> numero % 2 == 0)
                //transformando o número em seu quadrado
                .map(numero -> (numero * numero))
                //verificando se a lista está saindo com o valor ao quadrado
                .peek(numero -> System.out.println(numero))
                //convertendo inteiro para inteiro
                .mapToInt(Integer::intValue)
                //fechando a summaryStatistics
                .summaryStatistics();
        //imprimindo a soma dos valores dos quadrados
        System.out.println("Soma dos quadrados dos pares: " + resultado.getSum());

        /*Resposta do instrutor*/
        int somaQuadrados = listaNumeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(numero -> (numero * numero))
                .reduce(0, Integer::sum);

        System.out.println(somaQuadrados);

        /*5 - Dada uma lista de números inteiros, separe os números pares dos ímpares.*/
        System.out.println("\n-------------------------Separação de Numeros pares e ímpares ----------------------------");
        List<Integer> listaNs = Arrays.asList(1,2,3,4,5,6,7,8,9);
        /*System.out.println("Números pares: ");
        listaNs.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> System.out.println(numero));

        System.out.println("Números ímpares: ");
        listaNs.stream()
                .filter(numero -> !(numero % 2 == 0))
                .forEach(numero -> System.out.println(numero));*/

        /*Resposta do instrutor*/

        //transformando para boolean a lista de inteiros
        Map<Boolean, List<Integer>> listaSeparada = listaNs.stream()
                //particionando a lista em números pares e ímpares
                .collect(Collectors.partitioningBy(numero -> numero % 2 == 0));
        //se a resposta for true, imprime os pares
        System.out.println("Numeros pares: " + listaSeparada.get(true));
        //se a resposta for false, imprime os ímpares
        System.out.println("Numeros ímpares: " + listaSeparada.get(false));
    }

}
