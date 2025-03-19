package OrientacaoObjeto2.exceptions.gitHub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        //leitura dos dados
        System.out.println("Digite o nome do usuário a ser pesquisado: ");
        String usuario = leitura.nextLine();

        //concatenação de endereço
        String endereco = "https://api.github.com/users/" + usuario;

        try {
            //requisição http
            HttpClient client = HttpClient.newHttpClient();

            //request
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

            //resposta da request
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200){
                //biblioteca Gson para deixar Json fonmatado
                Gson gson = new GsonBuilder().setPrettyPrinting().create();

                String jsonFormatado = gson.toJson(gson.fromJson(response.body(), Object.class));

                //imprimir resposta
                System.out.println("A resposta da rqauisição foi: \n" + jsonFormatado);
            } else {
                throw new ErroConsultaGitHubException ("Usuário não encontrado, tente novamente!");
            }
        }
        catch (ErroConsultaGitHubException e) {
            //acessando exception em caso de usuário não encontrado
            System.out.println(e.getMensagem());
        }
    }
}
