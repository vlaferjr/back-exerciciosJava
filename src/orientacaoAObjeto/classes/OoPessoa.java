package orientacaoAObjeto.classes;
/* 1 - Crie uma classe javaInicio.Pessoa com um método que exibe "Olá, mundo!" no console.*/
public class OoPessoa {

    private String testePessoa = "exemplo de pessoa";
    public void escreveMetodo(){
        System.out.println("Método que exibe: Olá Mundo");
    }
    public String retornaTestePessoa(){
        return this.testePessoa;
    }

    public void alteraTestePessoa(String testePessoa){
        this.testePessoa = testePessoa;
    }
}
