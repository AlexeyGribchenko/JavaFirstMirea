package ru.mirea.task4.furnitureshop;

public class Chair extends AbstractFurniture {

    boolean isSoft;

    public Chair() {
        super();
        this.isSoft = false;
    }

    public Chair(double width, double length, double height, double price, boolean isSoft) {
        super(width, length, height, price);
        this.isSoft = isSoft;
    }

    @Override
    public String toString() {
        return "Chair. Is soft: " + this.isSoft + ";" + super.toString();
    }
}
