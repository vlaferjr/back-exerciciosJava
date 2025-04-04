package lambdas_streams_frameworks.generics.classes_estatisticas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //definição de uma lista de alunos
        List<Aluno> listaAlunos = Arrays.asList(
                new Aluno("Popinha", LocalDate.of(1980,07,28)),
                new Aluno("Popinho", LocalDate.of(1984, 05, 05)),
                new Aluno("Arlete", LocalDate.of(1955, 10, 28))
        );

        //calculando as estatísticas de listaAlunos
        IntSummaryStatistics estatisticas = listaAlunos.stream()
                //convertendo para inteiro
                .mapToInt(Aluno::getIdade)
                //reunindo as estatísticas
                .summaryStatistics();

        System.out.println("Soma das idades: " + estatisticas.getSum());
        System.out.println("Qtde de idades: " + estatisticas.getCount());
        System.out.println("Média das idades: " + estatisticas.getAverage());
        System.out.println("Menor idade: " + estatisticas.getMin());
        System.out.println("Maior idade: " + estatisticas.getMax());
    }

}
