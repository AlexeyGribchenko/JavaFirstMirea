package ru.mirea.task6.convertable;

public class FahrenheitConverter implements Convertable {
    @Override
    public double convert(double degrees) {
        return (degrees - 32.0) / 1.8;
    }
}
