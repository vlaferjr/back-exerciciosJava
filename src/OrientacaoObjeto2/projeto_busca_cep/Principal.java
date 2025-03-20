package OrientacaoObjeto2.projeto_busca_cep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    //---------------------Main
    public static void main(String[] args) {
        new Principal().executar();
    }

    public void executar()  {

        AcessaApiCep acessaApiCep = new AcessaApiCep(); // Instanciando a classe
        CriaJson criaJson = new CriaJson(); // Instanciando a classe
        EscreveJson escreveArquivo = new EscreveJson(); // Instanciando a classe
        String opcao;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite: 1 - para pesquisar o cep ou qualquer outro número para Sair");
        opcao = leitura.nextLine();

        //------------------------ Criação Json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        if(opcao.equals("1")){ // Comparando com a String "1"
            while (opcao.equals("1")){
                // ----------------------- Recebendo os daddos
                System.out.println("Digite o cep a ser buscado: ");
                String buscaCep = leitura.nextLine();

                try{

                    // ----------------------- Acesso à api
                    //chamada para requisição
                    HttpResponse<String> response = acessaApiCep.chamaApi(buscaCep);

                    if(response.statusCode() == 200){

                        Endereco endereco = gson.fromJson(response.body(), Endereco.class);

                        String cepFormatado = gson.toJson(endereco);
                        // -------------------------------- escreve em arquivo
                        escreveArquivo.escreveEmArquivo(gson,cepFormatado);

                        System.out.println("O que está impresso no arquivo é: \n" + cepFormatado);
                    } else {
                        System.out.println("Algum erro aconteceu na requisição. Código de status: " + response.statusCode());
                    }

                } catch (IOException | InterruptedException e) {
                    System.err.println("Erro: " + e.getMessage()); //Tratamento de exceção mais robusto
                }
                System.out.println("Digite: 1 - para pesquisar o cep ou qualquer outro número para Sair");
                opcao = leitura.nextLine(); // Atualizando a variável opcao dentro do loop
            }
        } else {
            System.out.println("Programa encerrado");
            System.exit(0); // Encerrando o programa
        }
        leitura.close(); // Fechando o Scanner
    }
}
