package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Task_1_4 {
    public static void run() {
        int[] array = new int[15];
        System.out.println("Using \"Math\":");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        System.out.print("Unsorted array: ");
        for (int i: array) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();

        Arrays.sort(array);

        System.out.print("Sorted array: ");
        for (int i: array) {
            System.out.print(i);
            System.out.print(' ');
        }

        System.out.println("\nUsing \"Random\":");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % 100;
        }

        System.out.print("Unsorted array: ");
        for (int i: array) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();

        Arrays.sort(array);

        System.out.print("Sorted array: ");
        for (int i: array) {
            System.out.print(i);
            System.out.print(' ');
        }
    }
}
