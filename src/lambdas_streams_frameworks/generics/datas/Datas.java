package lambdas_streams_frameworks.generics.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class Datas {
    public static void main(String[] args) {
        //DiaSemana, dia mês ano Hora:minuto:segundo Brasil
        String pattern = "E, dd MM yyyy HH:mm:ss z";
        //colocando no formato estipulado acima
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        //criação de nova data
        String data = simpleDateFormat.format(new Date());
        //impressão de data
        System.out.println(data);

// ------------------------ Data de aniversário
        //data de hoje
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje é: "+ hoje);

        //data de nascimento
        LocalDate dataNascimento = LocalDate.of(1984, Month.MAY, 05);
        System.out.println("Eu nasci em: " + dataNascimento);

        //calculando a idade
        int idade = hoje.getYear() - dataNascimento.getYear();
        System.out.println("A minha idade é: " + idade);

        //descobrir o período (dias e meses)
        Period periodo = Period.between(hoje, dataNascimento);
        System.out.println("minha idade com meses e dias é: " + periodo );


    }
}
