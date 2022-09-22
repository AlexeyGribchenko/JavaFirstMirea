package ru.mirea.task2.computershop;

import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfComputers;
        int price = 0;
        String brand = null;
        Shop computerShop = new Shop();

        System.out.print("Enter number of computers in a shop: ");
        numberOfComputers = sc.nextInt();
        sc.skip("\n");

        for (int i = 0; i < numberOfComputers; i++) {
            System.out.print("Computer № " + (i + 1) + "\nEnter brand: ");
            brand = sc.nextLine();
            System.out.print("Enter price: ");
            price = sc.nextInt();
            sc.skip("\n");
            computerShop.addComputer(new Computer(brand, price));
        }

        int choice = -1;
        while (choice != 0) {
            System.out.println("""
                    \nChoose action:
                    0 - Exit the program.
                    1 - Add new computer to the shop.
                    2 - Remove computer from the shop.
                    3 - Find computer in the shop.
                    4 - Show all of the computers."""
            );
            choice = sc.nextInt();
            sc.skip("\n");

            if (choice != 4 && choice != 0) {
                System.out.print("Enter brand: ");
                brand = sc.nextLine();
                System.out.print("Enter price: ");
                price = sc.nextInt();
                sc.skip("\n");
            }

            switch (choice) {
                case 1 -> computerShop.addComputer(new Computer(brand, price));
                case 2 -> computerShop.removeComputer(new Computer(brand, price));
                case 3 -> {
                    if ((computerShop.findComputer(new Computer(brand, price)))) {
                        System.out.println("Computer is found");
                    } else {
                        System.out.println("Computer is not found");
                    }
                }
                case 4 -> computerShop.printComputers();
                default -> {
                }
            }
        }
    }
}
