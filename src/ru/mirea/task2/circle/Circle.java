package ru.mirea.task2.circle;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeLength() {
        return 2 * Math.PI * this.radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public boolean compare(Circle circle) {
        return this.radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle`s radius: " + this.radius + " length: " + this.computeLength() + " area: " + this.computeArea();
    }
}
