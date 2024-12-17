package orientacaoAObjeto.for_foreach;

import java.util.ArrayList;

public class Nomes {
    public static void main(String[] args) {
        //declaração de uma lista de nomes do tipo String
        ArrayList <String> nomes = new ArrayList<>();
        //adicionando nomes
        nomes.add("Vanessa");
        nomes.add("Arlete");
        nomes.add("Vlad");
        nomes.add("Graça");

        //iterando a lista com foreach
        System.out.println("****** FOR NORMAL *******");
        for(String nome: nomes){ //cada item da lista será um nome do tipo string com os objetos nomes
            System.out.println(nome); //imprime os itens da lista
        }

        /*usando o foreadh*/
        System.out.println("***** FOR COM LAMBDA ********");
        nomes.forEach(nome-> System.out.println(nome)); /*pegar os nomes e fazer um foreach, cada nome será impresso com sout*/

        /*Method Reference*/
        System.out.println("****** FOR COM LAMBDA REDUZIDA ******");
        nomes.forEach(System.out::println);/*pega os nomes e imprime cada nome da lista*/
    }
}
