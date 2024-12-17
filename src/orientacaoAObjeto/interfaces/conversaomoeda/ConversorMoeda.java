package orientacaoAObjeto.interfaces.conversaomoeda;

public class ConversorMoeda implements ConversaoFinanceira{

    private double valorDolar;

     @Override
    public double converterDolarParaReal(double valorDolar) {
        double valorReal;
        valorReal = valorDolar * 5.66;
        return valorReal;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }
}
