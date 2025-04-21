package br.com.alura.VeiculosFipe;

import br.com.alura.VeiculosFipe.model.MarcasVeiculos;
import br.com.alura.VeiculosFipe.service.ClasseConverteDados;
import br.com.alura.VeiculosFipe.service.ConsumoApiService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
//implementação da linha de comando
public class VeiculosFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(VeiculosFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//criando novo objeto de ConsumoApiService
		ConsumoApiService consumoApiService = new ConsumoApiService();
		//chamando o obterDados de ConsumoApiService
		var json = consumoApiService.obterDados("https://parallelum.com.br/fipe/api/v1/caminhoes/marcas");
		//imprimindo a resposta da requisição
		System.out.println(json);
// ----------------------------- Desserializando as Marcas
		/*convertendo os dados do Json*/
		ClasseConverteDados converteDados = new ClasseConverteDados();
		List<MarcasVeiculos> dadosVeiculos = converteDados.obterDados(json, MarcasVeiculos.class);
		System.out.println(dadosVeiculos);

	}
}
