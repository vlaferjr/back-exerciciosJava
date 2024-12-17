package orientacaoAObjeto.interfaces.conversortemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double grausCelsius) {
        double conversaoParaFahrenheit =  (grausCelsius *1.8)+32;
        System.out.println(grausCelsius + "ºC" + "= "+ conversaoParaFahrenheit + "ºF");
    }

    @Override
    public void fahrenheitParaCelsius(double grausFahrenheit) {
        double conversaoParaCelsius = (grausFahrenheit-32)/1.8;
        System.out.println(grausFahrenheit + "ºF" + "= "+conversaoParaCelsius + "ºC");
    }
}
