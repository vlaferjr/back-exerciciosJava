package orientacaoAObjeto.arrayList_forEach.exercicio5;

public class Circulo implements Forma{

    //atributos do círculo
    double area = 0;

    //getters e setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //calculo da área do círculo
    @Override
    public double getCalcularArea() {
        return Math.PI * area * area;
    }
}
