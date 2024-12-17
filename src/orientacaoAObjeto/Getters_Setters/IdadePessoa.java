package orientacaoAObjeto.Getters_Setters;

public class IdadePessoa {
    //atributos privados
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade (int idade){
        String mensagem;
        this.idade = idade;
        if(idade >= 18){
            mensagem = "Maior de idade";
        } else {
            mensagem = "Menor de idade";
        } return mensagem;
    }
}
