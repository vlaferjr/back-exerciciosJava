package lambdas_streams_frameworks.generics.datas_horarios;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horarios {
    // ---------------------------------- Trabalhando com horários
    public static void main(String[] args) {
        //hora atual
        LocalTime hoje = LocalTime.now();
        //imprimindo hoje
        System.out.println("A hora atual: " + hoje);

// ----------------------------- horário de nascimento
        //declarando hr de nascimento
        LocalTime horaNascimento = LocalTime.of(12, 10, 0);
        //imprimindo hora nascimento
        System.out.println("Meu horário de nascimento foi: " + horaNascimento);


    }
}
