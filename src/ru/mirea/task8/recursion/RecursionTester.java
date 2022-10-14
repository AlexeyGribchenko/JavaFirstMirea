package ru.mirea.task8.recursion;

public class RecursionTester {
    public static void main(String[] args) {
        int number0 = 101;
        System.out.print("Число " + number0 + " является простым? - ");
        if (Recursion.isSimple(number0, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int number1 = 25200;
        System.out.print("Все простые множители числа " + number1 + ": ");
        Recursion.simpleDividers(number1, 2);

        System.out.println();
        String string = "polindromemordnilop";
        System.out.print("Является ли строка " + string + " полиндромом? - ");
        if (Recursion.isPalindrome(string, 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int a = 3, b = 3;
        System.out.println("Последовательносетей из " + a +
                " нулей и " + b + " единиц, где два нуля не стоят рядом друг с другом, сущестует: " +
                Recursion.withoutZeros(a, b));

        int number2 = 1234;
        System.out.println("Number {" + number2 + "} and its reversed version: " + Recursion.reverseNumber(number2, 0));
    }
}
