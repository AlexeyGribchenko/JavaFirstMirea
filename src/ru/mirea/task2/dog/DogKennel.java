package ru.mirea.task2.dog;

import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {

        Dog[] dogArray;
        Scanner scanner = new Scanner(System.in);
        String name;
        int age, numberOfDogs;

        System.out.print("How many dogs would you like to have?\nPlease, input the value: ");

        numberOfDogs = scanner.nextInt();
        scanner.skip("\n");
        dogArray = new Dog[numberOfDogs];

        for (int i = 0; i < numberOfDogs; i++) {

            System.out.print("Enter dog`s name: ");
            name = scanner.nextLine();

            System.out.print("Enter dog`s age: ");
            age = scanner.nextInt();
            scanner.skip("\n");

            dogArray[i] = new Dog(name, age);
        }

        System.out.print("\nIf dogs were human, their age would be:\n");

        for (Dog dog : dogArray) {
            dog.intoHumanAge();
        }
    }
}
