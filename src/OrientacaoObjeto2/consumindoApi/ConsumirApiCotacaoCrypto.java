package OrientacaoObjeto2.consumindoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumirApiCotacaoCrypto {
    public static void main(String[] args) throws IOException, InterruptedException {
        //leitura dos dados
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a moeda que será cotada: ");
        String moeda = leitura.nextLine();

        //link
        String linkInicio = "https://api.coingecko.com/api/v3/simple/price?ids=";
        String linkFim = "&vs_currencies=usd";

        //Client
        HttpClient client = HttpClient.newHttpClient();

        //Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(linkInicio + moeda + linkFim))
                .build();

        //response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        /*Impressão*/
        System.out.println("Reposta do servidor: " + response.body());
    }
}
