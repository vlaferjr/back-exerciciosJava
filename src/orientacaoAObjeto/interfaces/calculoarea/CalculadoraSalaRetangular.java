package orientacaoAObjeto.interfaces.calculoarea;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public double calcularArea(double altura, double largura) {
        double areaCalculada;
        areaCalculada = altura * largura;
        return areaCalculada;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double perimetoCalculado;
        perimetoCalculado = (altura * 2 ) + (largura * 2);
        return perimetoCalculado;
    }
}
