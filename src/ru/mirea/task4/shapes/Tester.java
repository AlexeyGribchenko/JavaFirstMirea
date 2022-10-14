package ru.mirea.task4.shapes;

public class Tester {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Shape(),
                new Circle(12.1),
                new Rectangle(3.2, 4.1),
                new Square(5.78)
        };

        for (Shape s : shapes) {
            System.out.printf("Shape: %10s\tArea: %6.2f\tPerimeter: %5.2f\n", s.getType(), s.getArea(), s.getPerimeter());
        }
    }
}
