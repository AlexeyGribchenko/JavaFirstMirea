package ru.mirea.task4.atelier;

public class Skirt extends Clothes implements WomenClothing{

    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt " + super.toString();
    }
}
