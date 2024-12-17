package orientacaoAObjeto.arrayList_forEach.exercicio3;

public class Principal {
    public static void main(String[] args) {
        //declarando um animal como um cachorro
        Animal animal = new Gato();

        //verificando se cachorro é um animal para fazer o cast
        if(animal instanceof Cachorro){
            //cast para usar o objeto cachorro como um cachorro e não como um Animal
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O Objeto é um cachorro");
        } else {
            System.out.println("Objeto não é um cachorro");
        }
    }
}
