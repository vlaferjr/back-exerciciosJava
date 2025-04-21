package br.com.alura.VeiculosFipe.principal;

import br.com.alura.VeiculosFipe.model.MarcasVeiculos;
import br.com.alura.VeiculosFipe.service.ClasseConverteDados;
import br.com.alura.VeiculosFipe.service.ConsumoApiService;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    Scanner leitura = new Scanner(System.in);
    public String exibeMenu() {
        //----------------------- Escolhendo a categoria
        System.out.println("****************** CATEGORIA DO VEÍCULO***************** ");
        String mensagem = "' Digite a categoria: \n" +
                "1 - Caminhões \n" +
                "2 - Carros \n" +
                "3 - Motos'";
        System.out.println(mensagem);
        int categoria = leitura.nextInt();
        String parametroCategoria = null;

        if (categoria == 1) {
            parametroCategoria = "caminhoes";
        } else if (categoria == 2) {
            parametroCategoria = "carros";
        } else if (categoria == 3) {
            parametroCategoria = "motos";
        } else {
            System.out.println("Categoria Inválida!");
        }
        return consumirApi(parametroCategoria);
    }

    //--------------------------- Escolher a marca do Veículo
    public String exibeMenuMarca(List<MarcasVeiculos> dadosVeiculos){
        System.out.println("\n****************** MARCA DO VEÍCULO***************** ");
        System.out.println("Digite a marca do veículo:");
        leitura.nextLine();
        String marca = leitura.nextLine();
        return buscaMarca(marca, dadosVeiculos);
    }


//------------------------------Consumindo a API

    //criando novo objeto de ConsumoApiService

    public String consumirApi(String parametroCategoria) {
        ConsumoApiService consumoApiService = new ConsumoApiService();
        //chamando o obterDados de ConsumoApiService
        var jsonCategoria = consumoApiService.obterDados("https://parallelum.com.br/fipe/api/v1/" + parametroCategoria + "/marcas");
        //imprimindo a resposta da requisição
        //System.out.println(json);
        return converterDados(jsonCategoria);

    }

    public String converterDados(String json) {
        /*convertendo os dados do Json*/
        ClasseConverteDados converteDados = new ClasseConverteDados();
        //chama o método obterDados de ClasseConverteDados
        List<MarcasVeiculos> dadosVeiculos = converteDados.obterDados(json, MarcasVeiculos.class);
        return exibeDados(dadosVeiculos);
    }

    // ----------------------------- Exibe Dados
    public String exibeDados(List<MarcasVeiculos> dadosVeiculos) {
        //ordenando por código em ordem crescente
        dadosVeiculos.sort(Comparator.comparing(MarcasVeiculos::codigo));
        //imprimindo cada marca
        dadosVeiculos.forEach(marca -> System.out.println(marca));
        exibeMenuMarca(dadosVeiculos);
        return null;
    }

    public String buscaMarca(String marca, List<MarcasVeiculos> dadosVeiculos){
        List<MarcasVeiculos> listaMarcaEscolhida = dadosVeiculos.stream()
                .filter(dado -> dado.nome().toLowerCase().equals(marca.toLowerCase()))
                .collect(Collectors.toList());
        System.out.println("A Marca escolhida foi: " + listaMarcaEscolhida);
       return null;
    }
}
