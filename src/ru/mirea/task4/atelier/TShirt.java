package ru.mirea.task4.atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "TShirt " + super.toString();
    }
}
