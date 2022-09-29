package ru.mirea.task4.shapes;

public class Shape {

    public String getType() {
        return "shape";
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Shape: %10s\tArea: %6.2f\tPerimeter: %5.2f", this.getType(), this.getArea(), this.getPerimeter());
    }
}
