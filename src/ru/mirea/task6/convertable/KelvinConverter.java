package ru.mirea.task6.convertable;

public class KelvinConverter implements Convertable {
    @Override
    public double convert(double degrees) {
        return degrees - 273.0;
    }
}
