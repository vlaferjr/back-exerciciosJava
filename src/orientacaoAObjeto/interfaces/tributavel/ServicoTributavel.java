package orientacaoAObjeto.interfaces.tributavel;

public class ServicoTributavel implements Tributavel{

    private String descricao;
    private double valor;
    private double aliquotaIss;

    //método que é implementado na interface Tributável
    @Override
    public double getValorImposto() {
        //o imposto do serviço é igual ao seu valor vezes a alíquota de ISS definida e dividido por 100
        return this.valor * aliquotaIss / 100;
    }
}
