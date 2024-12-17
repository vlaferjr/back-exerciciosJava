package orientacaoAObjeto.Getters_Setters;
public class PrincipalGettersSetters {

/*1-  Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.
        ContaBancariaExercicio1 contaBancaria = new ContaBancariaExercicio1();
        //acessado pelo método setNumeroConta da classe ContaBancariaExercicio1
        contaBancaria.setNumeroConta(1010);
        //acessado pelo método setSaldo da classe ContaBancariaExercicio1
        contaBancaria.setSaldoConta(1000);
        //acesso direto ao atributo
        contaBancaria.titular = "Titular da conta";

        //acessando como get pois quero somente exibir
        System.out.println("Conta Corrente: " + contaBancaria.getNumeroConta());
        System.out.println("Cliente: "+ contaBancaria.titular);
        System.out.println("Saldo da conta: " + contaBancaria.getSaldoConta());

        //colocando novo saldo
        contaBancaria.setSaldoConta(1500);
        //mostrando novo saldo
        System.out.println("Novo Saldo: " + contaBancaria.getSaldoConta());
    }*/

        /*2 - Crie uma classe idadePessoa com os atributos privados nome e idade.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Vlad");
        pessoa.setIdade(10);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        System.out.println(pessoa.verificarIdade(pessoa.getIdade()));
    }*/
    /*3 - Desenvolva uma classe Produto com os atributos privados nome e preco.
        Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        //acessado pelo método setNomeProduto da classe Produto
        produto1.setNomeProduto("Camisa Palmeiras");

        //acessado pelo método setPreco da classe Produto
        produto1.setPrecoProduto(300);
        // passa o percentual do desconto para ser chamado no método aplicarDesconto da classe Produto
        System.out.println("O Produto" + produto1.getNomeProduto() + "tem o preço final de: " + produto1.aplicarDesconto(0.50));
    } */

    /*4 - Desenvolva uma classe Aluno com os atributos privados nome e notas.
    Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método calcularMedia que retorna a média das notas do aluno.
    public static void main(String[] args) {
        //Parâmetros passados para o construtor que está na classe Aluno
        Aluno aluno1 = new Aluno("Vlad",4,7,4);
        //alteração do nome
        aluno1.setNomeAluno("Vlad");
        //passagem das notas
        //impressão das notas do aluno 1
        System.out.println("O aluno " + aluno1.getNomeAluno() + "com as notas: \n" +
                "Nota1: " + aluno1.getNota1() + "\n" +
                "Nota2: " + aluno1.getNota2() + "\n" +
                "Nota3: " + aluno1.getNota3() + "\n" +
                "Ficou com a média: " + aluno1.calculaMedia());
    } */

    /*
    * 5 - Desenvolva uma classe Livro com os atributos privados titulo e autor.
    * Utilize métodos getters e setters para acessar e modificar esses atributos.
    * Adicione um método exibirDetalhes que imprime o título e o autor do livro.*/
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos aneis");
        livro1.setAutor("J. R. R. Tolkien");
        livro1.exibirDetalhes();
    }
}
