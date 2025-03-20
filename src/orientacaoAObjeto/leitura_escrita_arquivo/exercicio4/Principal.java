package orientacaoAObjeto.leitura_escrita_arquivo.exercicio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        //-------- recebendo valores
        Scanner leitura = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        System.out.println("Digite a marca do veículo: ");
        veiculo.setMarca(leitura.nextLine());

        System.out.println("Digite o modelo do veículo: ");
        veiculo.setModelo(leitura.nextLine());

        System.out.println("Digite a cor do veículo");
        veiculo.setCor(leitura.nextLine());

        //--------- transoformando em json
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String jsonVeiculo = gson.toJson(veiculo);

        // ----------- Imprimindo no txt
        FileWriter escrita = new FileWriter("veiculo.txt");
        escrita.write(jsonVeiculo);
        escrita.close();

        //-------------  Imprimindo o que foi escrito
        System.out.println(jsonVeiculo);
    }
}
