package orientacaoAObjeto.arrayList_forEach.exercicio5;

public class Quadrado implements Forma{

    //atributos do quadrado
    double area = 0;

    //getters e setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //calculo da área do quadrado
    @Override
    public double getCalcularArea() {
        double areaTotal = (area * 2);
        return areaTotal;
    }
}
