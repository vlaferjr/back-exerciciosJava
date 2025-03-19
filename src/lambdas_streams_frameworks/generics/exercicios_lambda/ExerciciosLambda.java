package lambdas_streams_frameworks.generics.exercicios_lambda;

import OrientacaoObjeto2.exceptions.divisivelZero.ExceptionDivisivelZero;

import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosLambda {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número a ser usado na divisão:  ");
        int a = leitura.nextInt();

        System.out.println("Digite o primeiro número a ser usado na divisão:  ");
        int b = leitura.nextInt();

        OperacaoExerciciosLambda ehDivisivelZero = (x, y) ->{
            Boolean resposta = false;
            if ((x == 0) || y == 0){
                resposta = true;
               throw new ArithmeticException("Não é possível dividir por zero");
            } else {
                resposta =false;
                int resultado = x/y;
                System.out.println("O resultado da divisão foi: " + resultado);
            }
            return resposta;
        };
        try {
            ehDivisivelZero.divisivelPorZero(a, b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
