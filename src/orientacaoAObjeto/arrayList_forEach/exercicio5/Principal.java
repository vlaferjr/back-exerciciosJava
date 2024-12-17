package orientacaoAObjeto.arrayList_forEach.exercicio5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //criação dos objetos
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();

        //setando os valores
        quadrado.setArea(3.5);
        circulo.setArea(4);

        //criação da lista de formas
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(quadrado);
        listaDeFormas.add(circulo);

        //looping para lista de formas
        listaDeFormas.forEach(forma ->{
            System.out.println("Area do " + forma.getClass().getSimpleName() + " é: " + forma.getCalcularArea());
        } );
    }
}
