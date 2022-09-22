package ru.mirea.task2.circlepoint;

public class Circle {
    private Point center;

    public Circle() {
        this.center = new Point();
    }

    public Circle(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle`s center is at " + this.center.getPos();
    }
}
