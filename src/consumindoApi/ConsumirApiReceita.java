package consumindoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumirApiReceita {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*Leitura dos dados*/
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a receita a ser procurada:");
        String receita = leitura.nextLine();

        /*Link*/
        String link = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

        /*Client*/
        HttpClient client = HttpClient.newHttpClient();

        /*Request*/
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link + receita))
                .build();

        /*Response*/
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        /*Impressão da Resposta*/
        System.out.println("Resposta:" + response.body());
    }
}
