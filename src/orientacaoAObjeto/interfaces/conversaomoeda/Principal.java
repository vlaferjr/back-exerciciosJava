package orientacaoAObjeto.interfaces.conversaomoeda;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda dolar = new ConversorMoeda();
        double valorDolar = 2;
        double valorConvertidoReais = dolar.converterDolarParaReal(valorDolar);
        System.out.println("$ " + valorDolar + " dólares, equivale a R$ " + valorConvertidoReais);
    }
}
