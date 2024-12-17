package orientacaoAObjeto.herança.animal;

public class Cachorro extends Animal {
    //atributo som
    private String som;
    //reescrevendo o método emitirSom que vem da classe pai Animal
    @Override
    public void emitirSom(){
        som = "au au au";
        System.out.println(som);
    }
    // criação do método abanarRabo
    public void abanarRabo(){
        System.out.println("Cachorro abana Rabo");
    }

    public static void main(String[] args) {
        //criação do objeto labrador do tipo Cachorro
        Cachorro labrador = new Cachorro();
        //utilização dos métodos criados
       labrador.emitirSom();
       labrador.abanarRabo();
    }
}
