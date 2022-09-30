package ru.mirea.task4.vehicle;

public class Ship extends Vehicle {

    public Ship(double speed) {
        super(speed);
    }

    @Override
    public double calcTime(double distance) {
        return distance / this.speed;
    }

    @Override
    public double calcPrice(double distance) {
        return calcTime(distance) * 1500;
    }
}
