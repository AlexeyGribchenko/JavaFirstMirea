package ru.mirea.task7.strings;

public class StringTester {
    public static void main(String[] args) {
        ProcessString processString = new ProcessString();
        String str = "1234567890";

        System.out.println("Количество символов в строке {" + str + "}: " + processString.countSymbols(str));
        System.out.println("Строка из символов, стоящих на нечетных прзициях строки {" + str + "}: " + processString.getOddSymbolString(str));
        System.out.println("Перевернутая строка {" + str + "}: " + processString.reverse(str));
    }
}
