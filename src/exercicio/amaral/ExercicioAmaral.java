package exercicio.amaral;

import java.util.Arrays;

/*1 - Utilizando o seguinte array [5,8,5,8,8,8,3,2], proponha uma solução para retornar o resultado "3" de 3 pares de doces
sem repetir nenhuma posição utilizada para montar os pares, seguindo a regra 2*n para montar os pares.*/
public class ExercicioAmaral {
    public static void main(String[] args) {
        int [] array = {5,8,5,8,8,8,3,2};
        //ordenando array
        Arrays.sort(array,0,8);
        //impressão do array
        for(int i = 0; i < array.length;i++){
            System.out.println( array[i] + "=" + i);
        }
    }
}
