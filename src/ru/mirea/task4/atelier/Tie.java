package ru.mirea.task4.atelier;

public class Tie extends Clothes implements MenClothing {

    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie " + super.toString();
    }
}
