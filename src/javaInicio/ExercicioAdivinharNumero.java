package javaInicio;

import java.util.Random;
import java.util.Scanner;

public class ExercicioAdivinharNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //numero gerado randomico de 0 a 100
        int numeroGerado = new Random().nextInt(100);
        //palpite do usuário
        int palpite = 0;
        //laço para contar até 5 tentativas
        for (int i = 0; i < 5; i++) {
            System.out.println("Qual foi o número escolhido pelo sistema? ");
            palpite = leitura.nextInt();
            if(palpite<numeroGerado){
                System.out.println("O número escolhido é maior do que seu palpite, tente novamente");
            } else if (palpite > numeroGerado) {
                System.out.println("O número escolhido é menor do que seu palpite, tente novamente");
            } else if (palpite == numeroGerado){
                System.out.println("Parabéns! Você acertou o número");
            }
        }
        System.out.println("Que pena! O número escolhido foi: " + numeroGerado);
    }
}
