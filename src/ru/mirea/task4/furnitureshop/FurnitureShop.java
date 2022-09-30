package ru.mirea.task4.furnitureshop;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {

        AbstractFurniture[] furniture = {
                new Sofa(250.0, 80.0, 70.0, 120000.0, true),
                new Table(110.0, 90.0, 90.0, 23000.0, 3),
                new Chair(40.0, 40.0, 90.0, 7000.0, true)
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our furniture shop!");
        System.out.println("1 - " + furniture[0]);
        System.out.println("2 - " + furniture[1]);
        System.out.println("3 - " + furniture[2]);

        int choice;
        System.out.print("\nChoose furniture you want to buy: ");
        choice = sc.nextInt();

        System.out.println("Ok. You have bought a " +
                furniture[choice - 1].getType() +
                " for " +
                furniture[choice - 1].getPrice() +
                "\nThank you very much!");
    }
}