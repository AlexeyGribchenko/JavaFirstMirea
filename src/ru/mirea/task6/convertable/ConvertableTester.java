package ru.mirea.task6.convertable;

public class ConvertableTester {
    public static void main(String[] args) {

        double celciusDegrees = 24.0;

        KelvinConverter kelvinConverter = new KelvinConverter();
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

        System.out.printf("%.1f degrees Celsius is %.1f degrees Kelvin%n", celciusDegrees, kelvinConverter.convert(celciusDegrees));
        System.out.printf("%.1f degrees Celsius is %.1f degrees Fahrenheit%n", celciusDegrees, fahrenheitConverter.convert(celciusDegrees));
    }
}
