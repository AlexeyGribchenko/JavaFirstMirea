package ru.mirea.task2.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius1, radius2;
        System.out.print("Enter first radius: ");
        radius1 = sc.nextDouble();
        System.out.print("Enter second radius: ");
        radius2 = sc.nextDouble();

        Circle circle1 = new Circle(radius1);
        Circle circle2 = new Circle(radius2);

        System.out.println("\nFirst circle.\nLength: " + circle1.computeLength() + "\nArea: " + circle1.computeArea());
        System.out.println("\nSecond circle.\nLength: " + circle2.computeLength() + "\nArea: " + circle2.computeArea());

        if ((circle1.compare(circle2))) {
            System.out.println("\nFirst and second circles are equal");
        } else {
            System.out.println("\nFirst and second circles are not equal");
        }
    }
}
