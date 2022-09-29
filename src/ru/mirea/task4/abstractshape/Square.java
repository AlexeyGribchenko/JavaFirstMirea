package ru.mirea.task4.abstractshape;

public class Square extends Rectangle {

    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String getType() {
        return "square";
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    public String toString() {
        return String.format("Square. Side: %.1f\t\tColor: %s\t\tIs filled: %b", this.width, this.color, this.filled);
    }
}
