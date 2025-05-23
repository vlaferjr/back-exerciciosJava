package br.com.alura.VeiculosFipe_VProfessora;

import br.com.alura.VeiculosFipe_VProfessora.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeiculosFipeVProfessoraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosFipeVProfessoraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		//chamando menu da classe Principal
		principal.exibeMenu();
	}
}
