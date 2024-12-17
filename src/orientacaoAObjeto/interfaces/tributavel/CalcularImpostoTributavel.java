package orientacaoAObjeto.interfaces.tributavel;

public class CalcularImpostoTributavel {
    private double totalImposto = 0;

    /*CalculadoraImposto irá chamar o método implementado na classe específica.
    Ou seja, para um produto, irá chamar o método getTotalImposto implementado na classe Produto.
    E para um serviço, irá chamar o método getTotalImposto implementado na classe Servico.. */
    public void calcularImposto(Tributavel item) {
        this.totalImposto += item.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
