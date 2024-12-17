package orientacaoAObjeto.interfaces.conversortemperatura;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperaturaPadrao = new ConversorTemperaturaPadrao();
        double grausCelsius = 1;
        double grausFahrenheit = 2;

        temperaturaPadrao.celsiusParaFahrenheit(grausCelsius);
        temperaturaPadrao.fahrenheitParaCelsius(grausFahrenheit);
    }
}
