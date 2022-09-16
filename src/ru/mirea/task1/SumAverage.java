package ru.mirea.task1;

import java.util.Scanner;

public class SumAverage {
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

        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        float average = (float)sum / size;
        System.out.println("Summa: " + sum + " Average: " + average);
    }
}
