package orientacaoAObjeto.herança.numerosprimos;

public class NumerosPrimos {
    //valor recebido de VerificadorPrimo
    public Boolean verificarPrimalidade(int valor) {
        // Números menores que 2 não são primos
        if (valor < 2) {
            return false;
        }

        // Considera-se primo até que se prove o contrário
        Boolean ehPrimo = true;
        //contador = 2
        int i = 2;

        // eqto contador for menor que o valor passado
        while (i < valor) {
            //se o resto da divisão (valor/contador) for 0
            if (valor % i == 0) {
                //não é primo e termina o While
                ehPrimo = false;
                break;
            }
            //senão continua o laço
            i++;
        }
        //retorna verdadeiro ou falso
        return ehPrimo;
    }
    //recebe o número limite
    public void listarPrimos(int limite){
        //contador = 0
        int i = 0;
        System.out.println("Numeros primos até %d".formatted(limite));
        //eqto contador for menor que limeite
        while (i < limite){
            //verifica se o contador atual é primo
            if (verificarPrimalidade (i)){
                //imprime o contador atual
                System.out.println(i + ", ");
            } i++;
        }
        System.out.println();
    }
}
