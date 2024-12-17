package orientacaoAObjeto.classes;

import java.util.Scanner;

public class Execucao {
/*1 - Crie uma classe javaInicio.Pessoa com um método que exibe "Olá, mundo!" no console.
    public static void main(String[] args) {
        OoPessoa p1 = new OoPessoa();
        p1.escreveMetodo();
        System.out.println(p1.retornaTestePessoa());
        p1.alteraTestePessoa("testePessoa agora é texto alterado");
        System.out.println(p1.retornaTestePessoa());
        p1.alteraTestePessoa(null);
        try {
            System.out.println(p1.retornaTestePessoa().equals("teste"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("teste".equals(p1.retornaTestePessoa()));
    }*/
    /*2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
public static void main(String[] args) {
    Scanner leiura = new Scanner(System.in);
    System.out.println("Digite um numero para que seja calculado o dobro:");
    int numero = leiura.nextInt();
    OoCalculadora calculadora = new OoCalculadora();
    //passa o numero como parâmetro do objeto calculadora
    calculadora.calculaDobro(numero);
    //imprime o número já dobrado
    System.out.println("O dobro do numero %d, é %d".formatted(numero,calculadora.calculaDobro(numero)));
    }*/

    /*3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
    para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    public static void main(String[] args) {
        //input dos dados pelo usuário
        Scanner leitura = new Scanner(System.in);
        OoMusica musica = new OoMusica();
        System.out.println("Digite o nome da música:");
        String nome = leitura.nextLine();
        System.out.println("Digite o cantor:");
        String cantor = leitura.nextLine();
        System.out.println("Digite o ano da música:");
        String anoLancamento = leitura.nextLine();
        //passando os parâmetros para o método exibeFichaTecnica
        musica.exibeFichaTecnica(nome, cantor, anoLancamento);
        //calculo da média das notas
        float nota = 0;
                    for (int i = 1; i < 4; i++) {
                        System.out.println("Digite a nota para essa música");
                        nota = leitura.nextFloat();
                        //passando nota como parâmetro para o método avaliaMusica
                        musica.avaliaMusica(nota);
                    }
                }*/
    /*4 - Crie uma classe Carro com atributos modelo, ano, cor
    e métodos para exibir a ficha técnica e calcular a idade do carro.
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        OoCarro carro = new OoCarro();
        System.out.println("Digite a marca do carro:");
        String marca = leitura.nextLine();
        System.out.println("Digite o modelo do carro:");
        String modelo = leitura.nextLine();
        System.out.println("Digite a cor do carro:");
        String cor = leitura.nextLine();
        System.out.println("Digite o ano do carro:");
        int ano = leitura.nextInt();
        //enviando para o método os parâmetros (marca, modelo, cor, ano)
        carro.exibeFichaTecnica(marca, modelo, cor, ano);

        //método para imprimir o ano
        System.out.println("A idade do carro é: %d".formatted(carro.calculaIdade(ano)));
    }*/
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        OoAluno aluno = new OoAluno();
        System.out.println("Informe o nome do aluno:");
        String nome = leitura.nextLine();
        System.out.println("Informe a idade do aluno:");
        int idade = leitura.nextInt();
        //chamando o método infoAlunos com os parâmetros nome e idade
        aluno.infoAlunos(nome, idade);
    }
}


