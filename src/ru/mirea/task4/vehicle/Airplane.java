package ru.mirea.task4.vehicle;

public class Airplane extends Vehicle {

    public Airplane(double speed) {
        super(speed);
    }

    @Override
    public double calcTime(double distance) {
        return distance / this.speed;
    }

    @Override
    public double calcPrice(double distance) {
        return calcTime(distance) * 3000;
    }
}
