package lambdas_streams_frameworks.generics.caixa;

import lambdas_streams_frameworks.generics.caixa.Caixa;

public class TestaCaixa {
    public static void main(String[] args) {
        //caixa como sendo String
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.setConteudo("Guardando texto na caixa");
        System.out.println(caixaDeTexto.somaConteudoCaixa("Mais uma linha"));

        //Caixa como integer
        Caixa<Integer> caixaDeIdade = new Caixa<>();
        caixaDeIdade.setConteudo(30);
        System.out.println(caixaDeIdade.somaConteudoCaixa(26));

        //Caixa como Double
        Caixa <Double>caixaDeValor = new Caixa();
        caixaDeValor.setConteudo(150.50);
        System.out.println(caixaDeValor.somaConteudoCaixa(350.50));
        System.out.println(caixaDeValor.somaConteudoCaixa("texto"));

    }
}
