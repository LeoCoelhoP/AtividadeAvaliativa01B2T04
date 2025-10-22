package fag;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        setCelsius(celsius);
    }

    public double paraFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }

    public double paraKelvin() {
        return this.celsius + 273.15;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if(celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperatura inválida! Não pode ser menor que -273.15°C");
        }
    }

    public void mostrarTemperaturas() {
        System.out.printf("Temperatura em Celsius: %.2f\n", this.celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f\n", paraFahrenheit());
        System.out.printf("Temperatura em Kelvin: %.2f\n", paraKelvin());
    }
}
