package lambdas_streams_frameworks.generics.lambda.interface_funcional;

public class TesteOperacao {
    public static void main(String[] args) {

//----------------------------------- Usando classe anônima

        // declaração do método abstrato (Soma)
        Operacao soma = new Operacao() {
            @Override
            public int executar(int a, int b) {
                return a +b;
            }
        };
        System.out.println("O resultado da soma é: " + (soma.executar(5,3)) );

// ---------------------------------- Usando lambda
        // declaração do método abstrato (Subtração), já instanciando
        Operacao subtracao = ((a, b) -> a - b);
        System.out.println(subtracao.executar(5,3));
    }
}
