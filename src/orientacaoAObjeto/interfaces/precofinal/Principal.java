package orientacaoAObjeto.interfaces.precofinal;

public class Principal {
    public static void main(String[] args) {
        // Objeto livro a ser calculado na classe Livro
        Livro senhoDosAneis = new Livro();
        // passando preço por parâmetro
        double preco = 90;
        double precoFinalLivro = senhoDosAneis.calcularPrecoFinal(preco);
        //imprindo preço
        System.out.println("O preço final do livro foi: R$ " + precoFinalLivro);

        //Objeto Prodo Físico
        ProdutoFisico bola = new ProdutoFisico();
        //passando preço por parâmetro para classe ProdutoFísico
        preco = 120;
        double precoFinalBola = bola.calcularPrecoFinal(preco);
        //imprimindo preço
        System.out.println("O preço final da bola foi: R$ " + precoFinalBola);
    }
}
