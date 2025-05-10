package br.com.alura.VeiculosFipe_VProfessora.principal;

import br.com.alura.VeiculosFipe_VProfessora.model.DadosCompletosVeiculo;
import br.com.alura.VeiculosFipe_VProfessora.model.DadosVeiculo;
import br.com.alura.VeiculosFipe_VProfessora.model.ModelosVeiculo;
import br.com.alura.VeiculosFipe_VProfessora.service.ConsumoApi;
import br.com.alura.VeiculosFipe_VProfessora.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    private ConsumoApi consumoApi = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();
    //menu de opções
    public void exibeMenu(){
        var menu = """
                ****** OPÇÕES ******
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar
                """;
        //usuário escolhe a opção
        System.out.println(menu);
        var opcao = leitura.nextLine();

        //verificação do trecho digitado
        String endereco = "";
        if(opcao.toLowerCase().contains("car")){
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mo")) {
            endereco = URL_BASE + "motos/marcas";
        } else if (opcao.toLowerCase().contains("cam")) {
            endereco = URL_BASE + "caminhoes/marcas";
        }
        //passando endereço para consumoApi
        var json = consumoApi.obterDados(endereco);

        //imprimindo Json obtido
        System.out.println(json);

        //converter o json em lista de DadosVeiculo
        var marcas = conversor.obterLista(json, DadosVeiculo.class);

        //imprimir as marcas por ordem de código
        marcas.stream()
                .sorted(Comparator.comparing(DadosVeiculo::codigo))
                .forEach(System.out::println);

        //pedir a marca desejada
        System.out.println("Informe o código da marca: ");
        var codigoMarca = leitura.nextLine();

        //obtendo os modelos
        endereco = endereco + "/" + codigoMarca + "/" + "modelos";

        //buscar api para gerar o json
        json = consumoApi.obterDados(endereco);

        //obtendo a lista de modelos via json
        //uso do obterDados pq ele já é uma lista, sem precisar converter
        var listaModelos = conversor.obterDados(json, ModelosVeiculo.class);

        System.out.println("\n ******** MODELOS DA MARCA *******");
        listaModelos.modelos().stream()
                //ordenando os modelos pelos códigos
                .sorted(Comparator.comparing(DadosVeiculo::codigo))
                //iterando para imprimir modelo por modelo
                .forEach(System.out::println);

        //pedir um pedaço do modelo desejado
        System.out.println("\n Digite o modelo a ser buscado: ");
        var modeloEscolhido = leitura.nextLine();

        //criar uma nova lista baseada em listaModelos
        List<DadosVeiculo> modelosFiltrados = listaModelos.modelos().stream()
                //filtra o lista modelos com o nome parecido com nome escolhido por usuário
                .filter(modelo -> modelo.nome().toLowerCase().contains(modeloEscolhido.toLowerCase()))
                //coletar numa nova lista
                .collect(Collectors.toList());

        System.out.println("\n ****** Versões do modelo escolhido ****");
        //iterar para mostrar cada modelo
        modelosFiltrados.stream()
                .forEach(System.out::println);

        //pedir um código de um dos modelos listados
        System.out.println("\n Digite o código do modelo: ");
        var codigoModelo = leitura.nextLine();

        //atualizando endereço da api
        endereco = endereco + "/" + codigoModelo + "/anos";

        //buscar api para gerar o json
        json = consumoApi.obterDados(endereco);

        //convertendo json em DadosVeiculos para pegar os anos
        List<DadosVeiculo> anosVeiculos = conversor.obterLista(json, DadosVeiculo.class);

        //criar nova lista para obter os anos
        List<DadosCompletosVeiculo> dadosVeiculo =  new ArrayList<>();


        for (int i = 0; i < anosVeiculos.size(); i++) {
            //para cada ano encontrado atualizar o endereço da api concatenando com o codigo do índice
            var enderecoAnos = endereco + "/" + anosVeiculos.get(i).codigo();

            //busca api para gerar o json
            json = consumoApi.obterDados(enderecoAnos);

            //criação do novo veículo, convertendo o json em objeto da classe
            DadosCompletosVeiculo veiculo = conversor.obterDados(json, DadosCompletosVeiculo.class);

            //adiciona veiculo criado na lista
            dadosVeiculo.add(veiculo);
        }

        //mostrar os veículos e preços
        System.out.println("\n **** VEICULOS FILTRADOS COM PREÇOS E ANOS *****");
        dadosVeiculo.forEach(System.out::println);
    }
}
