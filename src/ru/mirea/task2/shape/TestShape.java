package ru.mirea.task2.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("Circle");

        System.out.println(shape1);
        System.out.println(shape2);
    }
}
