public class Principal {
    public static void main(String[] args) {
        // Conversão Celsius para Fahrenheit
        double tempCelsius = 25.0;
        double tempFahrenheit = ConversorUnidades.celsiusParaFahrenheit(tempCelsius);
        System.out.println(tempCelsius + "°C em Fahrenheit é: " + tempFahrenheit + "°F");

        // Conversão de Quilômetros para Milhas
        double distanciaQuilometros = 10.0;
        double distanciaMilhas = ConversorUnidades.quilometrosParaMilhas(distanciaQuilometros);
        System.out.println(distanciaQuilometros + " km em Milhas é: " + distanciaMilhas + " mi");

        // Conversão de Gramas para Libras
        double pesoGramas = 500.0;
        double pesoLibras = ConversorUnidades.gramasParaLibras(pesoGramas);
        System.out.println(pesoGramas + " g em Libras é: " + pesoLibras + " lb");
    }
}
