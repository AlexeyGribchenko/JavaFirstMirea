package ru.mirea.task4.shapes;

public class Rectangle extends Shape{
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.firstSide + this.secondSide);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
