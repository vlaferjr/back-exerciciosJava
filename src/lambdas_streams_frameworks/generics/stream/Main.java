package lambdas_streams_frameworks.generics.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

// ----------------------------- Filtrando números pares
        System.out.println("************* IMPRESSÃO DE LISTA DE NÚMEROS PARES *****************");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //filtragem
        numeros.stream()
                //filtrando os números pares
                .filter(numero -> numero % 2 == 0)
                //iterando sobre os números das codições acima
                .forEach(numero -> System.out.println(numero));

// ------------------------------ Transformando em maiúsculas
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PALAVRAS MAIÚSCULAS *****************");
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream()
                .forEach(palavra -> System.out.println(palavra.toUpperCase()));

// ------------------------------ Números ímpares multiplicados por 2
        System.out.println("\n************* IMPRESSÃO DE LISTA DE NÚMEROS ÍMPARES * 2 *****************");
        //aproveitando a lista do exercício 1
        //List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numerosImpares =
        numeros.stream()
                //filtrando os números ímpares
                .filter(numero -> !(numero % 2 == 0))
                //usando o map para converter os números multiplicando por 2
                .map(numero -> numero * 2)
                //coletando numa nova lista
                .collect(Collectors.toList());
        //imprimindo a nova lista
        System.out.println(numerosImpares);

// ------------------------------ Removendo duplicatas
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PALAVRAS SEM DUPLICIDADE *****************");
        //lista de palavras
        List<String> listaPalavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        //lista de palavras sem duplicatas (.distinct)
        listaPalavras.stream().distinct()
                //impressão da lista de palavras sem duplicatas
                .forEach(palavra -> System.out.println(palavra));

// ------------------------------ Extração de números primos
        System.out.println("\n************* IMPRESSÃO DE LISTA DE NUMEROS PRIMOS *****************");
        //lista de numeros com sublistas
        List <List<Integer>> listaNumeros = Arrays.asList(
                Arrays.asList(-1,1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );

        List <Integer> listaUnica = listaNumeros
                .stream()
                .flatMap(numero -> numero.stream())
                .collect(Collectors.toList());
        System.out.println(listaUnica);

        List<Integer> listaPrimos = listaUnica
                .stream()
                .filter(Main::isPrimo)
                .collect(Collectors.toList());

        System.out.println(listaPrimos);


// ------------------------------ Extração de pessoas maiores de 18 anos
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PESSOAS MAIORES de 18 anos *****************");

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Charlie", 19),
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17)
        );
        //criando nova lista de pessoas maiores
        List<Pessoa> pessoasMaiores = pessoas.stream()
                //colocando em ordem alfabética pelo nome
                .sorted(Comparator.comparing(Pessoa::getNome))
                //filtrando as pessoas maiores de 18 anos
                .filter(pessoa -> pessoa.idade > 18).toList();
        //imprimindo a lista pessoasMaiores
        pessoasMaiores.forEach(System.out::println);



// ------------------------------ Extração de Produtos eletrônicos menores que R$ 1000,00
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PRODUTOS ELETRÔNICOS ABAIXO DE R$ 1.000,00 *****************");
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );
        //cria lista de produtos eletrônicos
        List<Produto> produtosEletronicos = produtos
                .stream()
                //coloca a nova lista em ordem de preço
                .sorted(Comparator.comparing(Produto::getPreco))
                //filtra os produtos abaixo de R$1.000,00
                .filter(produto -> produto.getPreco() < 1000)
                //filtra os produtos da categoria Eletrônico
                .filter(produto -> produto.getCategoria().equals("Eletrônicos"))
                //coleta numa nova lista
                .collect(Collectors.toList());
        //imprime a lista de produtos eletrônicos
        produtosEletronicos.forEach(System.out::println);

// ------------------------------ Extração de Produtos eletrônicos mostrando os 2 itens mais baratos
        System.out.println("\n************* IMPRESSÃO DE LISTA DE PRODUTOS ELETR ÔNICOS (2 + BARATOS) *****************");

        List<Produto> listaProdutosbaratos = produtos
                .stream()
                //ordenando os produtos por ordem de preço, mais barato para mais caro
                .sorted(Comparator.comparing(Produto::getPreco))
                //filtrando os produtos da categoria Eletrônicos
                .filter(produto -> produto.getCategoria().equals("Eletrônicos"))
                //limitando em mostrar somente os 2 primeiros
                .limit(2)
                //coletando numa nova lista
                .collect(Collectors.toList());
        //imprindo a lista nova listaProdutosbaratos
        listaProdutosbaratos.forEach(System.out::println);
    }

// ------------------------------------------------------------------------------------------------
    // método que verifica se é primo
    public static boolean isPrimo(int num){
        boolean resp = true;

        if (num< 0){
            resp = false;
        }
        else if (num > 0){
            resp = true;

            for (int i = 2; i < num; i++){
                int result = num % i;
                if ( result == 0){
                    resp = false;
                    break;
                }
                else {
                    resp = true;
                }
            }
        }
        return resp;
    };
}
