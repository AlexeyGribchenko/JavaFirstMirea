package ru.mirea.task4.abstractshape;

public class Tester {
    public static void main(String[] args) {

        Circle circle = new Circle(92.5, "White", true);
        System.out.println("\nWhite filled circle with radius: 92.5:");
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(10.1, 7.2, "Blue", false);
        System.out.println("\nBlue unfilled rectangle with length: 10.1, width: 7.2:");
        System.out.println(rectangle);

        Square square = new Square(16.6, "Green", true);
        System.out.println("\nGreen filled square with side: 16.6:");
        System.out.println(square);
    }
}
