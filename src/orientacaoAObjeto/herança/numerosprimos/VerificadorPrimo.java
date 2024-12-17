package orientacaoAObjeto.herança.numerosprimos;

public class VerificadorPrimo extends NumerosPrimos{
    boolean resultado;
    //valor recebido do teste
    public boolean verificarSeEhPrimo(int valor){
        NumerosPrimos numero = new NumerosPrimos();
        //se o valor recebido (enviado ao método verificarPrimalidade for primo
        if (numero.verificarPrimalidade(valor) == true){
            //resultado = true
            resultado = true;
        } else {
            //resultado falso
            resultado = false;
        } return resultado;
    }
}
