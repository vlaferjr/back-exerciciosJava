package javaInicio;

public class ObjetoProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "PC";
        p1.descontoPix = 0.5;
        p1.preco = 1000;

        System.out.println("javaInicio.Produto: " + p1.nome + "custa: " + p1.preco + "com desconto de: " + p1.descontoPix);
    }
}
