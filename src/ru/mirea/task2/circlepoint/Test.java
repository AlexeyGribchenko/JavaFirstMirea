package ru.mirea.task2.circlepoint;

import java.util.Scanner;

public class Test {

    private static Circle[] circles;
    private static int circlesSize;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle`s array size: ");
        circlesSize = sc.nextInt();

        circles = new Circle[circlesSize];
        double x, y;

        for (int i = 0; i < circlesSize; i++) {
            System.out.print("Enter circle`s center position (x, y): ");
            x = sc.nextDouble();
            y = sc.nextDouble();
            circles[i] = new Circle(new Point(x, y));
        }

        System.out.println("Now you have " + circlesSize + " circles. Their center`s coordinates:");
        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
