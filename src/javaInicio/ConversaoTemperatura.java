package javaInicio;

public class ConversaoTemperatura {
    public static void main (String[] args){

        double grausCelsius = 36.5;
        int grausFahrenheit;

        //uso do castint para conversão dos graus Celsius (double para int)
        grausFahrenheit = (int) ((grausCelsius * 1.8)+32);

        //uso da resposta com text block
        String resposta = """
                A temperatura em graus Celsius: %.2fº
                representa %d em graus Fahnhereith
                """.formatted(grausCelsius,grausFahrenheit);

        System.out.println(resposta);
    }
}
