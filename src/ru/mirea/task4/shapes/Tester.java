package ru.mirea.task4.shapes;

public class Tester {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println("Shape:");
        System.out.println(shape);

        Circle circle = new Circle(12.1);
        System.out.println("\nCircle(radius: 12.1):");
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3.2, 4.1);
        System.out.println("\nRectangle(firstSide: 3.2, secondSide: 4.1):");
        System.out.println(rectangle);

        Square square = new Square(5.78);
        System.out.println("\nSquare(sideL 5.78)");
        System.out.println(square);
    }
}
