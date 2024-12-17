package orientacaoAObjeto.interfaces.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) { //método que vem da interface
        for(int i = 0; i <= 10; i++){
            int result = numero * i;
            System.out.println(numero + "*" + i + "=" + result);
        }
    }
}
