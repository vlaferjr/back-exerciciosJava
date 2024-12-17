package orientacaoAObjeto.lista_de_compras.desafio_lista_compras_corrigido;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    /*atributos*/
    private double limite;
    private double saldo;

    /*Atributo Lista de Compras*/
    private List<Compra> listaCompras;


    /*Construtor*/
    public CartaoCredito(double limite) {
        this.limite = limite;
        //no começo o saldo é o limite total
        this.saldo = limite;
        //inicialização como Array da Lista de Compras
        this.listaCompras = new ArrayList<>();
    }

    /*Getters*/
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    /*Método para lançar Compras*/
    public boolean lancarCompras(Compra compra){
        /*Verificar se saldo é maior que valor da compra*/
        if (this.saldo > compra.getValor()){
            //abate o valor da compra no saldo
            this.saldo -= compra.getValor();
            //Adicionando compra na lista de compra
            this.listaCompras.add(compra);
            //pode fazer a compra
           return true;
        }
        //não pode fazer a compra
        return false;
    }
}
