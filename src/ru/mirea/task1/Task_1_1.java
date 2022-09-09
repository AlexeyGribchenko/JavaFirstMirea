package ru.mirea.task1;

public class Task_1_1 {
    public static void run() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0, sum2 = 0, sum3 = 0, iter1 = 0, iter2 = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum1 += array[i];
        }
        while (iter1 < array.length)
        {
            sum2 += array[iter1];
            iter1++;
        }
        do {
            sum3 += array[iter2];
            iter2++;
        } while (iter2 < array.length);
        System.out.println("Сумма1: " + sum1 + '\n' + "Сумма2: " + sum2 + '\n' + "Сумма3: " + sum3);
    }
}
