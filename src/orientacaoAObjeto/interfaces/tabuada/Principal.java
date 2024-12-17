package orientacaoAObjeto.interfaces.tabuada;

public class Principal {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        int numero = 5;
        tabuada.mostrarTabuada(numero); //chama método de TabuadaMultiplicacao
    }
}
