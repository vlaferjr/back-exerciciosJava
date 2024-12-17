package orientacaoAObjeto.classes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class OoCarro {
    //recebe os parâmetros enviados de Execucao
    void exibeFichaTecnica(String marca, String modelo, String cor, int ano ){
        System.out.println("******** FICHA TÉCNICA - CARROS********");
        System.out.println("Marca: %s".formatted(marca));
        System.out.println("Modelo: %s".formatted(modelo));
        System.out.println("cor: %s".formatted(cor));
        System.out.println("ano: %d".formatted(ano));
    }

    int  calculaIdade(int ano){
        //colocando a data de hoje
        LocalDate hoje = LocalDate.now();
        //pegando apenas o ano da data de hoje
        int anoHoje = hoje.getYear();
        //calculando a idade do carro
        int resp = anoHoje - ano;
        //retornando resp para Execução
        return resp;
    }
}
