package OrientacaoObjeto2.projeto_busca_cep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AcessaApiCep {
    public HttpResponse<String> chamaApi (String cep) throws IOException, InterruptedException {
        String endereco = "https://viacep.com.br/ws/" +cep + "/json"; //concatena endereço

        URI uri = URI.create(endereco); //definição do URI de endereço

        HttpClient client = HttpClient.newHttpClient();//cliente que faz requisição

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        return  client.send(request,HttpResponse.BodyHandlers.ofString());
    }
}
