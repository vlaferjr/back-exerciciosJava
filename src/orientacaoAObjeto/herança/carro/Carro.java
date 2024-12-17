package orientacaoAObjeto.herança.carro;

public class Carro {
    //atributos do carro
    private String modelo;
    //lista de 3 preços
    private double[] precos = new double[3];
    //lista de 3 anos
    private int anos[] = new int[3];

    //getters e setters
    private String marca;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double[] getPrecos() {
        return precos;
    }
    public void setPrecos(double[] precos) {
        this.precos = precos;
    }
    public int[] getAnos() {
        return anos;
    }
    public void setAnos(int[] anos) {
        this.anos = anos;
    }
    /* Método para calcular os preços*/
    public double calculaPrecos(){
        double soma = 0;
        //para cada preço do array preços será somado um preço
        for (double preco : precos){
            soma = soma + preco;
        }
        //soma dividido pelo número de elementos dentro do array
        return soma / precos.length;
    }

    /*Método para decidir o maior preço*/
    public double maiorPreco(){
        //define maior como sendo o menor dos valores
        double maior = Double.MIN_VALUE;
        //para cada iteração, se preço for maior que o valor armazenado em MAIOR, então preço passa ser maior
        for(double preco:precos){
            if(preco > maior){
                maior = preco;
            }
        }
        return maior;
    }

    /*Método para decidir menor Preço*/
    public double menorPreco(){
        //define menor como sendo maior dos valores
        double menor = Double.MAX_VALUE;
        //para cada iteração, se preço for menor que o valor armazenado em menor, então preço passa ser menor
        for (double preco:precos){
            if (preco<menor){
                menor = preco;
            }
        }
        return menor;
    }
}
