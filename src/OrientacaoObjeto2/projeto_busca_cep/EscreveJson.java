package OrientacaoObjeto2.projeto_busca_cep;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class EscreveJson {
    public void escreveEmArquivo(Gson gson, String cep) throws IOException {
        FileWriter escreveArquivo = new FileWriter("escreveCep.txt");
        escreveArquivo.write(gson.toJson(cep));
        escreveArquivo.close();
        System.out.println("Arquivo Json criado com sucesso.");
    }
}
