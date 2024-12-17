package javaInicio;

public class ObjetosPessoa {
    public static void main(String[] args) {

        // Definição dos objetos javaInicio.Pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 25;

        Pessoa p2 = new Pessoa();
        p2.nome = "João";
        p2.idade = 40;

        //Impressão dos objetos javaInicio.Pessoa
        System.out.println(p1.nome + "tem" + p1.idade);
        System.out.println(p2.nome + "tem" + p2.idade);
    }
}
