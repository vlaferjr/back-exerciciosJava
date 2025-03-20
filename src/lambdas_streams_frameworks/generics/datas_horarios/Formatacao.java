package lambdas_streams_frameworks.generics.datas_horarios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatacao {

    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        //imprimindo agora
        System.out.println("Agora é: " + agora);

        //formatação de data dia/mes/ano hora:min:seg
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //Data e hora formatadas
        LocalDateTime agoraFormatado = LocalDateTime.now();
        //impressão de data/hora formatada
        System.out.println("Agora é (Padrão Brasil): " + agoraFormatado.format(formatador));
    }
}
