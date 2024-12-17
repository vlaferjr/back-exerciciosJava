package orientacaoAObjeto.arrayList_forEach.exercicio1;

import java.util.ArrayList;

public class Excercicio1 {
    public static void main(String[] args) {
        //criando array List
        ArrayList <String> lista = new ArrayList<>();

        //adicionando itens na lista do tipo String
        lista.add("Vanessa");
        lista.add("Arlete");
        lista.add("Graciana");
        lista.add("Vladmir");

        //percorrendo a lista
        /*Para cada item da lista será impresso um nome*/
        lista.forEach(nomes -> System.out.println(nomes));
    }
}
