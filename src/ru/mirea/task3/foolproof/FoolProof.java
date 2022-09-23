package ru.mirea.task3.foolproof;

import java.util.Random;
import java.util.Scanner;

public class FoolProof {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        while (size < 1) {
            System.out.print("Wrong value entered! Please enter natural number: ");
            size = sc.nextInt();
        }

        int[] array = new int[size];
        Random random = new Random();
        System.out.println("First array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, size + 1);
            System.out.printf("%d ", array[i]);
        }
        int[] array2 = new int[(int)(array.length / 2 + 1)];
        System.out.println("\nSecond array:");
        for (int i = 0; i < array.length; i+=2) {
            array2[i / 2] = array[i];
            System.out.printf("%d ", array2[i / 2]);
        }
    }
}
