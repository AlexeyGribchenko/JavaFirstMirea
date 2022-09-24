package ru.mirea.task3.currencyconverter;

public class CurConverter {

    static public double toDollars(double value) {
        return value / 58.1;
    }

    static public double toEuro(double value) {
        return value / 56.48;
    }

    static public double toYuan(double value) {
        return value * 8.15;
    }

    static public double toJena(double value) {
        return value * 2.49;
    }
}
