package orientacaoAObjeto.ordenacaoLista.titulo;

public class Titulo implements Comparable<Titulo>{

    //declaração do atributo nome
    private String nome;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //método da interface Comparable
    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }

    //uso do ToString para imprimir corretamente
    @Override
    public String toString() {
        return "\n Título: " + this.getNome();
    }

}
