package lambdas_streams_frameworks.generics.imutabilidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploImutablidade {
    public static void main(String[] args) {
        //criando a lista
        List<String> listaOriginal = new ArrayList<>();
        //adicionando elementos na lista
        listaOriginal.add("A");
        listaOriginal.add("B");

        //deixando a lista imutavel
        List<String>listaImutavel = Collections.unmodifiableList(listaOriginal);

        //tentando adicionar o 3º elemento na lista
        listaImutavel.add("C");
    }
}
