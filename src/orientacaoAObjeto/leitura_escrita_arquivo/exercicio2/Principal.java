package orientacaoAObjeto.leitura_escrita_arquivo.exercicio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        //---------------- Declaração das variáveis
        Scanner leitura = new Scanner(System.in);
        Titulo pessoa = new Titulo();

        System.out.println("digite o nome: ");
        pessoa.setNome(leitura.nextLine());

        System.out.println("digite a idade: ");
        pessoa.setIdade(leitura.nextInt());
        leitura.nextLine();

        System.out.println("digite o grau de parentesco: ");
        pessoa.setParentesco(leitura.nextLine());


        //--------------------Serializar objeto
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String jsonPessoa = gson.toJson(pessoa);

        //------------------- Imprimindo o objeto
        FileWriter escrita = new FileWriter("titulo.txt");
        escrita.write(gson.toJson(jsonPessoa));
        escrita.close();

        //--------------------- Imprimindo o que for escrito
        System.out.println(jsonPessoa);
    }
}
