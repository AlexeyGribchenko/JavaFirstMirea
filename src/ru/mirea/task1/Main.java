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
                case "1" -> SumAverage.run();
                case "2" -> SumMinMax.run();
                case "3" -> Arguments.run(args);
                case "4" -> HarmonicSeries.run();
                case "5" -> Factorial.run(Integer.parseInt(args[1]));
                default -> System.out.println("Incorrect value. Enter an argument: a number from 1 to 5");
            }
        }
    }
}