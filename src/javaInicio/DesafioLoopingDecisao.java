package javaInicio;

import java.util.Scanner;

public class DesafioLoopingDecisao {
    public static void main(String[] args) {
        // 1.Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
        // exiba "Número positivo", caso contrário, exiba "Número negativo".
        Scanner leitura = new Scanner(System.in);

        //numero digitado pelo usuário
        int numero = 0;
        //lendo o número digitado
        System.out.println("Digite um número positivo ou negativo: ");
        numero = leitura.nextInt();

        if(numero > 0){
            System.out.println("O numero é positivo, vc digitou: " + numero);
        } else if (numero < 0) {
            System.out.println("O numero é negativo, vc digitou: " + numero);
        } else{
            System.out.println("O numero é zero");
        }

        //2.Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais,
        // diferentes, o primeiro é maior ou o segundo é maior.
        Scanner leitura1 = new Scanner(System.in);

        int n1, n2;
        //ler 2 nºs do usuário
        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leitura1.nextInt();
        //comparando os números
        if(n1==n2){
            System.out.println("Os nºs digitados são iguais");
        } else if (n1>n2) {
            System.out.println("Os nºs digitados são diferentes e %d é maior que %d".formatted(n1,n2));
        } else {
            System.out.println("Os nºs digitados são diferentes e %d é menor que %d".formatted(n1,n2));
        }

       //3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e
        // "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área
        // com base na opção selecionada.

        Scanner leitura2 = new Scanner(System.in);
        int opcao;
        //leitura da opção digitada
        System.out.println("Digite: \n 1. Calcular área do quadrado \n2. Calcular área do círculo");
        opcao = leitura.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Cálculo da área do quadrado");
                System.out.println("Digite um número para que seja calculado o quadrado");
                int area;
                area = leitura2.nextInt();
                System.out.println("O cálculo do quadrado para o %d é: %d X %d = %d".formatted(area,area,area,area*area));
                break;
            case 2:
                System.out.println("Cálculo da área do círculo");
                System.out.println("Digite um número para que seja calculado o círculo");
                int area2;
                area2 = leitura2.nextInt();
                System.out.println("O calculo do círculo é: %d² * pi = %d".formatted(area2,(area2*area2)*3,14) );
                break;
        }


        //4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        Scanner leitura3 = new Scanner(System.in);
        System.out.println("Digite um n° para fazer a tabuada: ");
        int n = leitura3.nextInt();
        for (int i = 0; i < 11 ; i++) {
            System.out.println("%d x %d = %d".formatted(i,n,i*n));
        }

        //5. Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        Scanner leitura4 = new Scanner(System.in);
        System.out.println("Digite um nº para saber se é par ou ímpar");
        int blabla = leitura4.nextInt();

        if(blabla%2 == 0){
            System.out.println("O nº digitado foi %d e é par".formatted(blabla));
        } else {
            System.out.println("O nº digitado foi %d e é ímpar".formatted(blabla));
        }

        //6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        Scanner leitura5 = new Scanner(System.in);
        //leitura do nº digitado
        System.out.println("Digite um nº para que seja calculado o seu fatorial");
        int number = leitura5.nextInt();
        int i = 0;
        int resposta = 1;
        while (i < number){
            i++;
            resposta = resposta * i;
           System.out.println("valor de n = %d \n valor de i = %d \n valor de resposta %d".formatted(number,i,resposta));
        }
        System.out.println("O fatoriak de %d é %d".formatted(number,resposta));
    }
}
