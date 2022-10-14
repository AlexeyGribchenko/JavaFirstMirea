package ru.mirea.task7.mathcalculable;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double value, double powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double complexModule(double a, double b) {
        return power((a * a + b * b), 1.0 / 2.0);
    }

    public double circleS(double r) {
        return PI * power(r, 2);
    }
}