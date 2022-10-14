package ru.mirea.task7.mathcalculable;

public class MathCalculableTester {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        double number = 14.0;
        double realPart = 3.0;
        double imaginaryPart = 4.0;
        double radius = 17.7;

        System.out.println("Квадрат числа " + number + ": " + mathFunc.power(number, 2.0));
        System.out.println("Модуль комплексного числа " + realPart + " + " + imaginaryPart + "i: " + mathFunc.complexModule(realPart, imaginaryPart));
        System.out.println("Площадь круга с радиусом " + radius + ": " + mathFunc.circleS(radius));
    }
}
