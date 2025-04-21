package br.com.alura.VeiculosFipe.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApiService {
    //método para obter dados da api
    public String obterDados (String endereco){
        //requisição feita pelo cliente
        HttpClient cliente = HttpClient.newHttpClient();
        //cliente envia requisição (construção da requisição
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        //inicialmente a resposta recebe null
        HttpResponse<String> resposta = null;
        //tentar receber a resposta
        try{
            //resposta recebe requisição feita pelo cliente em corpo de string
            resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        } //se não conseguir responder por exceção
        catch (IOException e ){
            throw new RuntimeException();
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
        //retorno da resposta
        return resposta.body();
    }
}
