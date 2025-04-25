package br.com.alura.VeiculosFipe.principal;

import br.com.alura.VeiculosFipe.VeiculosFipeApplication;
import br.com.alura.VeiculosFipe.model.MarcasVeiculos;
import br.com.alura.VeiculosFipe.service.BuscaService;
import br.com.alura.VeiculosFipe.service.ClasseConverteDados;
import br.com.alura.VeiculosFipe.service.ConsumoApiService;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@Component
public class Principal {
    Scanner leitura = new Scanner(System.in);
    ConsumoApiService consumoApiService = new ConsumoApiService();

    private final BuscaService buscaService;
    public Principal(BuscaService buscaService) {
        this.buscaService = buscaService;
    }
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
        return consumirApiMarcas(parametroCategoria);
    }

    //--------------------------- Escolher a marca do Veículo
    public List<String> exibeMenuMarca(List<MarcasVeiculos> dadosVeiculos){
        System.out.println("\n****************** MARCA DO VEÍCULO***************** ");
        System.out.println("Digite a marca do veículo:");
        leitura.nextLine();
        String marca = leitura.nextLine();
        List<String> codigoMarcaEscolhida = buscaService.buscaMarcaModelo(marca, dadosVeiculos);;
        consumirApiModelos(codigoMarcaEscolhida);
        return null;
    }

//------------------------------Consumindo a API
    //criando novo objeto de ConsumoApiService

    public String consumirApiMarcas(String parametroCategoria) {
        //chamando o obterDados de ConsumoApiService
        var jsonCategoria = consumoApiService.obterDados("https://parallelum.com.br/fipe/api/v1/" + parametroCategoria + "/marcas");
        //imprimindo a resposta da requisição
        //System.out.println(json);
        return converterDados(jsonCategoria);
    }

    public String  consumirApiModelos (List<String> parametroMarcaEscolhida){
        //pegando o primeiro elemento da lista e tirando os []
        String codigoMarca = parametroMarcaEscolhida.get(0);
        //chamando API para mostrar os modelos
        var jsonModelos = consumoApiService.obterDados("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + codigoMarca + "/modelos");
        //imprimindo a resposta da requisição
        System.out.println(jsonModelos);
        //continuar do return (No exibeDados não pode chamar o exibeMenuMarca (adaptar))
        return jsonModelos;
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
        dadosVeiculos.forEach(escolhido -> System.out.println(escolhido));
        exibeMenuMarca(dadosVeiculos);
        return null;
    }
}
