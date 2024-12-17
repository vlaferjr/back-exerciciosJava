package orientacaoAObjeto.arrayList.pessoas;

public class Pessoas {

    //atributos
    private String nome;
    private int idade;

    //getger e setters
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

    //Método to String
    @Override
    public String toString() {
        return "\nNome: " + this.nome + ", " + "Idade: " + this.idade;
    }
}
