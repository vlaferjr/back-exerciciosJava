package orientacaoAObjeto.herança.carro;

import java.util.Scanner;

public class ModeloCarro extends Carro{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Carro carro1 = new Carro();
        //Marca do Carro
        System.out.println("Digite a marca do carro: ");
        carro1.setMarca(leitura.nextLine());
        //Modelo do carro
        System.out.println("Digite o modelo do carro");
        carro1.setModelo(leitura.nextLine());
        //Preenchendo os anos e preços
        int[] anos = new int[3];
        double[] precos = new double[3];
        for(int i = 0; i<3 ; i++){
            System.out.println("Digite o ano do carro: ");
            anos[i] = leitura.nextInt();
            System.out.println("Digite o preço do carro no ano de " + anos[i]);
            precos[i] = leitura.nextDouble();
        }

        //setando o objeto carro 1
        carro1.setAnos(anos);
        carro1.setPrecos(precos);

        //Exibe Ficha Técnica (Marca e Modelo)

            String mensagem = """
                *************FICHA TÉCNICA *******************
                Marca: %s
                Modelo: %s
                """.formatted(carro1.getMarca(), carro1.getModelo());

        System.out.println(mensagem);

        //exibe Anos e preços
        System.out.println("------Preços ao longo dos anos-----");
        for(int i = 0; i <3; i++){
            System.out.println("Ano:" + carro1.getAnos()[i] + "Preço:" + carro1.getPrecos()[i]);
        }
        //preço mais alto
        System.out.println("Preço mais caro:" + String.format("%.2f",carro1.maiorPreco()));
        //menor preço
        System.out.println("Preço mais barato:" + String.format("%.2f",carro1.menorPreco()));
        //média dos preços
        System.out.println("Preço Médio: " + String.format("%.2f", carro1.calculaPrecos()));
    }
}

