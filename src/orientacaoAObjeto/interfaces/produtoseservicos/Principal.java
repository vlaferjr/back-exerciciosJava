package orientacaoAObjeto.interfaces.produtoseservicos;

public class Principal {

    public static void main(String[] args) {
        Produto camiseta = new Produto();
        double preco = 155;
        int quantidade = 2;

        camiseta.precoTotal(preco, quantidade);
        System.out.println("Seu produto saiu por: R$ " + camiseta.precoTotal(preco, quantidade));

        //serviço
        Servico limpeza = new Servico();
        double precoLimpeza = 250;
        int qtde = 4;

        limpeza.precoTotal(precoLimpeza, qtde);
        System.out.println("Seu serviço saiu por: R$ " + limpeza.precoTotal(precoLimpeza, qtde));
    }
}
