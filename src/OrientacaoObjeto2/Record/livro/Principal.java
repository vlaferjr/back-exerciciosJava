package OrientacaoObjeto2.Record.livro;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        //declaração do objeto livro, com objeto Editora dentro
        Livro livro = new Livro("Fortaleza Digital", "Dan Brown", new Editora("Arqueiro"));

        //Uso da biblioteca Gson
        Gson gson = new Gson();

        //convertendo em Json (para json)
        String jsonLivro = gson.toJson(livro);

        //impressão do Json
        System.out.println("Livro depois de convertido para json: \n" + jsonLivro);

        //Deserializando (Json para objeto) Livro
        Livro livro1 = gson.fromJson(jsonLivro, Livro.class);

        //imprimindo livro (objeto) (Json para objeto)
        System.out.println("Livro depois de convertido para objeto: \n" + livro1);
    }
}
