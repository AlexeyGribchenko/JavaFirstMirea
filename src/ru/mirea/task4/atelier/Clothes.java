package ru.mirea.task4.atelier;

public abstract class Clothes {
    protected Sizes size;
    protected double price;
    protected String color;

    public Clothes(Sizes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String toString() {
        return "Size: " + this.size + " Price: " + this.price + " Color: " + this.color;
    }
}
