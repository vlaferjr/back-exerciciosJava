package exceptions.divisivelZero;

import java.util.Scanner;

public class ExceptionDivisivelZero {
    public static void main(String[] args) {
        //lendo os números para a divisão
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        try {
            int n1 = leitura.nextInt();

            System.out.println("Digite o segundo número:");
            int n2 = leitura.nextInt();

            double result = n1 / n2;

            System.out.printf("O resultado da divisão foi: %3f%n", result);
        }
        catch (ArithmeticException e){
            System.out.println("Não se pode dividir qualquer número por 0, forneça outro número");
        }
    }
}
