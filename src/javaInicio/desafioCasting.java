package javaInicio;

public class desafioCasting {
    public static void main (String[] args){
        //1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double n1,n2, media;
        n1 = 10.36;
        n2=5.84;
        media = (n1+n2)/2;

        System.out.println("Resultado do Exercicio1: " + media);

        //2. Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.
        double n3 = 3.75;
        //ao converter de double para int, fica somente a parte inteira
        int n4 = (int) n3;
        System.out.println("Resultado do Exercicio2: " + n4);

        //3.Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char parte1 = 'E'; //Quando é char é um caractere e é colocado aspas simples
        String parte2 = "sse é o resultado do Exercício 3";
        System.out.println(parte1 + parte2);

        //4.Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double  precoProduto = 4.70;
        int quantidade = 3;
        System.out.println("Resultado do Exercício 4: O preço final é de %.2f reais".formatted(precoProduto * quantidade));

        //5. Declare uma variável do tipo double valorEmDolares.
        // Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 7.35;
        System.out.println("Resultado do Exercício 5: O valor para US$%.2f equivale a R$%.2f".formatted(valorEmDolares,valorEmDolares*4.94));

        //6.Declare uma variável do tipo double precoOriginal.
        // Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e
        // atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 35.50;
        double percentualDesconto = 10;
        System.out.println("Resultado do Exercício 6: Valor Original: R$ %.2f, valor com desconto: R$ %.2f".formatted(precoOriginal,precoOriginal-((precoOriginal*10)/100)));
    }
}
