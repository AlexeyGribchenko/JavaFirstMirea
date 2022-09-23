package ru.mirea.task1;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Enter \"1\" to run AverageSum.");
            System.out.println("Enter \"2\" to run SumMinMax.");
            System.out.println("Enter \"3\" and any other arguments to run Arguments.");
            System.out.println("Enter \"4\" to run HarmonicSeries.");
            System.out.println("Enter \"5\" to run Factorial.");
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