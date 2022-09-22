package ru.mirea.task2.circlepoint;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getPos() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public String toString() {
        return "Point`s position is (" + this.x + ", " + this.y + ")";
    }
}
