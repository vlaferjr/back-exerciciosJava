package orientacaoAObjeto.herança.animal;

public class Gato extends Animal{
    //criação do atributo som
    private String som;
    //reescrevendo método emitir Som que vem da classe pai Animal
    @Override
    public void emitirSom(){
        som = "miau miau";
        System.out.println(som);
    }
    //criação do método arranharMoveis
    public void arranharMoveis(){
        System.out.println("Gato arranha móveis");
    }
    //método main para usar os métodos criados acima
    public static void main(String[] args) {
        Gato xangrila = new Gato();
        //uso do método emitirSom
        xangrila.emitirSom();
        //uso do método arranharMóveis
        xangrila.arranharMoveis();
    }
}
