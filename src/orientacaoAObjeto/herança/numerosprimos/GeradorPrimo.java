package orientacaoAObjeto.herança.numerosprimos;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int valor){
        //valor recebido do teste + 1
        int proximoNumero = valor+1;
        // eqto o próximo número não for primo
        while (!verificarPrimalidade(proximoNumero)){
            //proximo número +1
            proximoNumero++;
        } return proximoNumero;
    }
}
