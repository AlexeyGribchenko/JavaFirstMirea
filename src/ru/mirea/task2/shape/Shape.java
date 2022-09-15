package ru.mirea.task2.shape;

public class Shape {

    private String shape;

    public Shape() {
        shape = "Unknown";
    }

    public Shape(String shape) {
        this.shape = shape;
    }

    public String toString() {
        return this.shape;
    }
}
