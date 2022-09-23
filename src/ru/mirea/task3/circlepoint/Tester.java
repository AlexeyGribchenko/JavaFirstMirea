package ru.mirea.task3.circlepoint;

import java.sql.SQLOutput;

public class Tester {

    private static Circle[] circles;
    private static int circlesSize;

    private static Circle findMin() {
        Circle minCircle = new Circle(Double.MAX_VALUE);
        for (Circle c : circles) {
            if (c.getRadius() < minCircle.getRadius()) {
                minCircle = c;
            }
        }
        return minCircle;
    }

    private static Circle findMax() {
        Circle maxCircle = new Circle(Double.MIN_VALUE);
        for (Circle c : circles) {
            if (c.getRadius() > maxCircle.getRadius()) {
                maxCircle = c;
            }
        }
        return maxCircle;
    }

    private static void sort() {
        Circle tmp;
        for (int i = 0; i < circlesSize; i++) {
            for (int j = 0; j < circlesSize; j++) {
                if (circles[i].getRadius() < circles[j].getRadius()) {
                    tmp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = tmp;
                }
            }
        }
    }

    private static void print() {
        for (Circle c : circles) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        circlesSize = (int)(Math.random() * 5 + 5);
        circles = new Circle[circlesSize];
        for (int i = 0; i < circlesSize; i++) {
            circles[i] = new Circle();
        }

        System.out.println("\nArray of circles:");
        print();

        System.out.println("\nThe largest circle:");
        System.out.println(findMax());

        System.out.println("\nThe smallest circle:");
        System.out.println(findMin());

        System.out.println("\nSorted array:");
        sort();
        print();

    }
}
