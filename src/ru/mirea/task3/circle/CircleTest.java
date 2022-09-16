package ru.mirea.task3.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Let`s create circle with coordinates (10, 10) and radius is 15.");
        Circle circle = new Circle(10, 10, 15);
        System.out.println(circle);

        System.out.println("Now you can set your own properties, which one do you want to change?\n1) Coordinates\n2) Radius\n3) Length \n4) Diameter");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        float x, y, radius, diameter, length;

        switch (choice) {
            case 1 -> {
                System.out.println("Enter x and y:");
                x = scanner.nextFloat();
                y = scanner.nextFloat();
                circle.setXYCenter(x, y);
            }
            case 2 -> {
                System.out.println("Enter radius:");
                radius = scanner.nextFloat();
                circle.setRadius(radius);
            }
            case 3 -> {
                System.out.println("Enter length:");
                length = scanner.nextFloat();
                circle.setLength(length);
            }
            case 4 -> {
                System.out.println("Enter diameter:");
                diameter = scanner.nextFloat();
                circle.setDiameter(diameter);
            }
            default -> {
            }
        }
        System.out.println("Circle with new properties:");
        System.out.println(circle);
    }
}
