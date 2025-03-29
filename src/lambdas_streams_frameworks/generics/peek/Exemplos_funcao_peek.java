package lambdas_streams_frameworks.generics.peek;

import java.util.Arrays;
import java.util.List;

public class Exemplos_funcao_peek {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int soma = numeros.stream()
                //mostra o conteúdo de cada item da lista
                .peek(num -> System.out.println("O número: " + num))
                //multiplica cada número da lista por 2
                .map(num -> num * 2)
                //mostra como ficou cada número depois do map (num * 2)
                .peek(num -> System.out.println("* 2 = "  + num))
                //faz a soma de cada item da lista com o numero anterior
                .reduce(0, (total, num) -> total + num);
        //imprime o resultado
        System.out.println("A soma dos números é: " + soma);
    }
}
