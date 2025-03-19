package OrientacaoObjeto2.projeto_busca_cep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CriaJson {
    private Gson gson;
    //--------------------- Criação do objeto Json
    public CriaJson() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public Gson getGson() {
        return gson;
    }
}


