package OrientacaoObjeto2.consumindoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumirApiGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        //leitura dos dados
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título do livro:");
        String titulo = leitura.nextLine();

        /*definição do link da API*/
        String link = "https://www.googleapis.com/books/v1/volumes?q=";

        /*Requisição HTTP*/
        HttpClient client = HttpClient.newHttpClient(); //faz o pedido ao servidor

        //o que é e para onde vai a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link + titulo)).build();

        /*Resposta da Requisição*/
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        /*Impressão do retorno*/
        System.out.println("Resposta: \n" + response.body());
    }
}
