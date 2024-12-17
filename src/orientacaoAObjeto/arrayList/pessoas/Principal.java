package orientacaoAObjeto.arrayList.pessoas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //instanciando a pessoa 1
        Pessoas popinha = new Pessoas();
        popinha.setNome("Vanessa Leme ferrari");
        popinha.setIdade(44);

        //instanciando pessoa 2
        Pessoas popinho = new Pessoas();
        popinho.setNome("Vlad Ferrari Jr");
        popinho.setIdade(40);

        //instanciando pessoa 3
        Pessoas sogra = new Pessoas();
        sogra.setNome("Graciana Lourenço Leme");
        sogra.setIdade(78);

        //instanciando objeto listaDepessoas como lista do tipo Pessoas
        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();

        //adicionando pessoas à lista
        listaDePessoas.add(popinha);
        listaDePessoas.add(popinho);
        listaDePessoas.add(sogra);

        //imprimir o tamanho da lista
        System.out.println("****************** LISTA DE PESOAS ******************** \n");
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        //imprimindo a primeira pessoa da lista
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        //imprimindo a lista completa
        System.out.println("\nLista completa: " + listaDePessoas);
    }
}
