package ru.mirea.task2.dog;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {

        Dog[] dogArray;
        Scanner scanner = new Scanner(System.in);
        String name;
        int age, numberOfDogs;

        System.out.print("How many dogs would you like to have?\nPlease, input the value: ");

        numberOfDogs = scanner.nextInt();
        dogArray = new Dog[numberOfDogs];

        for (int i = 0; i < numberOfDogs; i++) {

            System.out.print("\nEnter dog`s name: ");
            name = scanner.next();

            System.out.print("\nEnter dog`s age: ");
            age = scanner.nextInt();

            dogArray[i] = new Dog(name, age);
        }

        System.out.print("\nIf dogs were humans, their age would be like this:\n");

        for (Dog dog : dogArray) {
            dog.intoHumanAge();
        }
    }
}
