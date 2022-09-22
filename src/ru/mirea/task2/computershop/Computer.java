package ru.mirea.task2.computershop;

public class Computer {
    private int price;
    private String brand;

    public Computer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public boolean compare(Computer computer) {
        return this.brand.equals(computer.brand) && this.price == computer.price;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + " Price: " + this.price;
    }
}
