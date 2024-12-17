package orientacaoAObjeto.herança.numerosprimos;

public class TesteNumerosPrimos {

       public static void main(String[] args) {
           //Verificar se é primo
           VerificadorPrimo numero = new VerificadorPrimo();
            // valor passado ao método verificarSeEhPrimo
           int valorPassado = 7;
           // o retorno do método for verdadeiro
           if(numero.verificarSeEhPrimo(valorPassado) == true){
               System.out.println("O número %d é primo".formatted(valorPassado));
           } else {
               System.out.println("O número %d NÃO é primo".formatted(valorPassado));
           }

           //Listar primos
           NumerosPrimos lista = new NumerosPrimos();
           lista.listarPrimos(5);

           //gerador de primp
           GeradorPrimo gerador = new GeradorPrimo();
           int proximoPrimo = gerador.gerarProximoPrimo(17);

           System.out.println("O próximo primo é:" + proximoPrimo);
       }
}
