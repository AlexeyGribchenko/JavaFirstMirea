package ru.mirea.task4.vehicle;

import java.util.Scanner;

public class VehicleTester {
    public static void main(String[] args) {
        Car car = new Car(80.0);
        Airplane airplane = new Airplane(800.0);
        Ship ship = new Ship(60.0);
        Train train = new Train(110.0);

        double distance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance you want to cover: ");
        distance = sc.nextInt();

        System.out.printf("If you want to travel by car, it will take %.1f hours and it will cost %.1f.\n",
                car.calcTime(distance), car.calcPrice(distance));
        System.out.printf("If you want to travel by airplane, it will take %.1f hours and it will cost %.1f.\n",
                airplane.calcTime(distance), airplane.calcPrice(distance));
        System.out.printf("If you want to travel by ship, it will take %.1f hours and it will cost %.1f.\n",
                ship.calcTime(distance), ship.calcPrice(distance));
        System.out.printf("If you want to travel by train, it will take %.1f hours and it will cost %.1f.\n",
                train.calcTime(distance), train.calcPrice(distance));
    }
}
