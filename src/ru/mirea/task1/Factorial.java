package ru.mirea.task1;

public class Factorial {
    public static void run(int n) {
        long number = 1;
        for (int i = 1; i <= n; i++) {
            number *= i;
        }
        System.out.printf("%d! = %d", n, number);
    }
}
