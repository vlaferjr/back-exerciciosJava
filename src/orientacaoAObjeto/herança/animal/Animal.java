package orientacaoAObjeto.herança.animal;

public class Animal {

    //criação do atributo som
    private String som;
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public void emitirSom(){
        this.som = "algum som";
    }
}
