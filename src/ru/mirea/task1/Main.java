package ru.mirea.task1;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Enter \"1\" to run Task_1_1. Other arguments will be ignored.");
            System.out.println("Enter \"2\" and any other arguments to run Task_1_2.");
            System.out.println("Enter \"3\" to run Task_1_3. Other arguments will be ignored.");
            System.out.println("Enter \"4\" to run Task_1_4. Other arguments will be ignored.");
            System.out.println("Enter \"5\" and one positive number to run Task_1_5.");
        } else {
            switch (args[0]) {
                case "1" -> Task_1_1.run();
                case "2" -> Task_1_2.run(args);
                case "3" -> Task_1_3.run();
                case "4" -> Task_1_4.run();
                case "5" -> Task_1_5.run(Integer.parseInt(args[1]));
                default -> System.out.println("Incorrect value. Enter an argument: a number from 1 to 5");
            }
        }
    }
}