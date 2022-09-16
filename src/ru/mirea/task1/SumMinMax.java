package ru.mirea.task1;

import java.util.Scanner;

public class SumMinMax {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        System.out.print("Enter array size: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Enter array:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum1 = 0;
        int sum2 = 0;
        int i1 = 0;
        int i2 = 0;

        while (i1 < size) {
            sum1 += array[i1];
            max = Integer.max(max, array[i1]);
            i1++;
        }

        do {
            sum2 += array[i2];
            min = Integer.min(min, array[i2]);
            i2++;
        } while (i2 < size);

        System.out.println("Summa 1: " + sum1 + " Summa 2: " + sum2 + " Min: " + min + " Max: " + max);
    }
}
