package ru.mirea.task3.fournumberarray;

import java.util.Random;

public class FourNumberArray {

    private static void print(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }

    private static boolean isIncreases(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void fillRandom (int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10, 100);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[4];

        fillRandom(array);
        print(array);
        if (isIncreases(array)) {
            System.out.println("\nArray is increasing sequence.");
        } else {
            System.out.println("\nArray isn`t increasing sequence.");
        }
    }
}
