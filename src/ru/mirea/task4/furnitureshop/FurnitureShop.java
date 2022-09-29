package ru.mirea.task4.furnitureshop;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Sofa sofa = new Sofa(250.0, 80.0, 70.0, 120000.0, true);
        Table table = new Table(110.0, 90.0, 90.0, 23000.0, 3);
        Chair chair = new Chair(40.0, 40.0, 90.0, 7000.0, true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our furniture shop!\nChoose furniture you want to buy:");
        System.out.println("1 - " + sofa);
        System.out.println("2 - " + table);
        System.out.println("3 - " + chair);
    }
}