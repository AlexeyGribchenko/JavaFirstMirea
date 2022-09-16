package ru.mirea.task1;

public class Arguments {
    public static void run(String[] args) {
        for (int i = 1; i < args.length; i++) {
            System.out.print(args[i] + ' ');
        }
    }
}
