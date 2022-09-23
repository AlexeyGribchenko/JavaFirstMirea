package ru.mirea.task3.circlepoint;

import ru.mirea.task2.circlepoint.Point;

public class Circle {
    private double radius;
    private double length;
    private Point center;

    public Circle() {
        this.center = new Point();
        this.radius = Math.random() * 20.0;
        this.length = this.radius * 2.0 * Math.PI;
    }

    public Circle(double radius) {
        this.center = new Point();
        this.radius = radius;
        this.length = this.radius * 2.0 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle`s radius: %.2f length: %.2f", this.radius, this.length);  //"Circle`s radius: " + this.radius + " length: " + this.length;
    }
}
