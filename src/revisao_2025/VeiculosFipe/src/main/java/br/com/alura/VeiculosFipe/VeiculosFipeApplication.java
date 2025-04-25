package br.com.alura.VeiculosFipe;

import br.com.alura.VeiculosFipe.model.MarcasVeiculos;
import br.com.alura.VeiculosFipe.principal.Principal;
import br.com.alura.VeiculosFipe.service.ClasseConverteDados;
import br.com.alura.VeiculosFipe.service.ConsumoApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
//implementação da linha de comando
public class VeiculosFipeApplication implements CommandLineRunner {

	@Autowired
	private Principal principal;

	public static void main(String[] args) {
		SpringApplication.run(VeiculosFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal.exibeMenu();
	}
}
