package orientacaoAObjeto.interfaces.calculoarea;

public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        double alturaSala = 2;
        double larguraSala = 5;

        double areaCalculada = sala.calcularArea(alturaSala, larguraSala);
        double perimetroCalculado = sala.calcularPerimetro(alturaSala, larguraSala);

        System.out.println("A sala com: " + alturaSala + "de altura, e " + larguraSala + "de largura, tem " + areaCalculada + " metros de área e " + perimetroCalculado + " metros de perímetro");
    }
}
