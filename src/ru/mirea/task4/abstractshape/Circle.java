package ru.mirea.task4.abstractshape;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle. Radius: %.1f\t\tColor: %s\t\tIs filled: %b", this.radius, this.color, this.filled);
    }
}
