package revisao_2025.desafioBuscadorCeps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        // -------------- Montagem de menu
        int opcaoMenu = 0;
        System.out.println("Digite: \n" +
                "0 - Sair \n" +
                "1 - Continuar pesquisando ceps");
        opcaoMenu = leitura.nextInt();

        while (opcaoMenu == 1) {

            //--------------- Solicita pesquisa ao usuário
            System.out.println("Digite o cep a ser pesquisado: ");
            leitura.nextLine();
            String cep = leitura.nextLine();

            // --------------Concatenar endereço para busca na API
            String endereco = "https://viacep.com.br/ws/" + cep + "/json";

            try {
                // -------------- Requisição HTTP
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                //------------------------ Gerar Json
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Endereco enderecoResponse = gson.fromJson(response.body(),Endereco.class);

                // ----------------------- impressão do Json formatado
                String jsonFormatado = gson.toJson(enderecoResponse);

                // ---------------- Impressão da resposta
                System.out.println("------Rsposta-----\n" +
                        jsonFormatado);

                // --------------- Salvar Json
                FileWriter escrita = new FileWriter("consultaCep.txt");
                escrita.write(jsonFormatado);
                escrita.close();

            } catch (IOException | InterruptedException e){
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println("Digite: \n" +
                    "0 - Sair \n" +
                    "1 - Continuar pesquisando ceps");
            opcaoMenu = leitura.nextInt();

        }


    }
}
