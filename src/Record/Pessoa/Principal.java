package Record.Pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        //Definição do objeto Pessoa
        Pessoa p1 = new Pessoa("Ana", 25, "Guarulhos");
        Pessoa p2 = new Pessoa("João", 32, "São Paulo");

        //Acrescentando o Json
        String jsonPessoa = "{\"nome\": " + p1.nome() + ", \"cidade\": " + p1.cidade() + "}";

        //Impressão dos objetos javaInicio.Pessoa
        System.out.println("Json pessoa sem a formatação: \n" + jsonPessoa);

        //Uso da biblioteca Gson
        //Gson gson = new Gson();

        //para lidar de forma que o Json fique flexível
        Gson gson = new GsonBuilder().setLenient().create();

        //Usando o Gson para transformar o Json em objeto Pessoa
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);


        //Impressão do objeto já formatado
        System.out.println("Objeto já formatado depois do Gson: \n" + pessoa);
    }
}
