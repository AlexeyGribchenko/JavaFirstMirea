package ru.mirea.task4.furnitureshop;

public class Sofa extends AbstractFurniture {

    boolean isPillowsIncluded;

    public Sofa() {
        super();
        this.isPillowsIncluded = false;
    }

    public Sofa(double width, double length, double height, double price, boolean isPillowsIncluded) {
        super(width, length, height, price);
        this.isPillowsIncluded = isPillowsIncluded;
    }

    @Override
    public String toString() {
        return "Chair. Are pillows included: " + this.isPillowsIncluded + ";" + super.toString();
    }
}
