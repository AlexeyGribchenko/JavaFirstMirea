package ru.mirea.task14.regularexpressions;

public class RegexTester {
    public static void main(String[] args) {
        String longString = "Лёша Витя Костя Артём";
        System.out.println("Делим строку {" + longString + "} по пробелу");
        RegularExpressions.splitStringAndShow(longString, " ");
        System.out.println();

        longString = "Мама%Папа%Сестра%Брат";
        System.out.println("Делим строку {" + longString + "} по знаку процента");
        RegularExpressions.splitStringAndShow(longString, "%");
        System.out.println();

        System.out.println("Проверяем строки на совпадение со строкой abcdefghijklmnopqrstuv18340:");
        String strangeString1 = "abcdefghijklmnopqrstuv18340";
        System.out.println(strangeString1 + " " + RegularExpressions.checkStrangeString(strangeString1));
        String strangeString2 = "abcdefdasdghijklmnopqrstuv18340";
        System.out.println(strangeString2 + " " + RegularExpressions.checkStrangeString(strangeString2));
        System.out.println();

        System.out.println("Ищем подходяшие форматы цен:");
        String prices = "152.43 USD, 213.12321 RUB, 12 RUB, 534223.12 EU";
        RegularExpressions.extractPricesAndShow(prices);
        System.out.println();

        System.out.println("Проверяем даты на корректность:");
        String[] dates = { "01/01/2001", "32/12/3000", "15/07/1899", "14/13/1968" };
        for (String date: dates) {
            if (RegularExpressions.isStringDate(date)) {
                System.out.println(date + " is correct date");
            } else {
                System.out.println(date + " is incorrect date");
            }
        }
        System.out.println();

        System.out.println("Проверяем адреса электронных почт:");
        String[] emails = { "gribchenko.2003@mail.ru", "host@@@com.ru", "@my.ru", "hello_world.ru" };
        for (String email: emails) {
            if (RegularExpressions.isStringEmail(email)) {
                System.out.println(email + " is correct email");
            } else {
                System.out.println(email + " is incorrect email");
            }
        }
        System.out.println();

        System.out.println("Проверяем адреса электронных почт:");
        String[] passwords = { "PW0e_12", "AAAaaa999_1", "aaaaaaaaa", "213asd_asdad" };
        for (String password: passwords) {
            if (RegularExpressions.isPasswordGood(password)) {
                System.out.println(password + " is good password");
            } else {
                System.out.println(password + " isn`t good password");
            }
        }
        System.out.println();
    }
}
