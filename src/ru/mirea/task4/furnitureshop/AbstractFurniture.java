package ru.mirea.task4.furnitureshop;

public abstract class AbstractFurniture {

    protected double width;
    protected double length;
    protected double height;
    protected double price;

    public AbstractFurniture() {
        this.width = 0.0;
        this.length = 0.0;
        this.height = 0.0;
        this.price = 0.0;
    }

    public AbstractFurniture(double width, double length, double height, double price) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.price = price;
    }

    public abstract double getPrice();

    public abstract String getType();

    public String toString() {
        return String.format(" Sizes (%.1f, %.1f, %.1f)", this.width, this.length, this.height);
    }
}
