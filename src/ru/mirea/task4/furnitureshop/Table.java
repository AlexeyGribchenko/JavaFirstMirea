package ru.mirea.task4.furnitureshop;

public class Table extends AbstractFurniture {

    int numberOfTableLegs;

    public Table() {
        super();
        this.numberOfTableLegs = 0;
    }

    public Table(double width, double length, double height, double price, int numberOfTableLegs) {
        super(width, length, height, price);
        this.numberOfTableLegs = numberOfTableLegs;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return "table";
    }

    @Override
    public String toString() {
        return "Chair. Number of table legs: " + this.numberOfTableLegs + ";" + super.toString();
    }
}
