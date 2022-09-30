package ru.mirea.task4.vehicle;

public abstract class Vehicle {
    protected double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public abstract double calcTime(double distance);

    public abstract double calcPrice(double distance);
}
