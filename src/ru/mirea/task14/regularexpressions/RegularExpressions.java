package ru.mirea.task14.regularexpressions;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void splitStringAndShow(String string, String delim) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, delim);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
    public static boolean checkStrangeString(String strangeString) {
        Pattern pattern = Pattern.compile("^(abcdefghijklmnopqrstuv18340)$");
        Matcher matcher = pattern.matcher(strangeString);
        return matcher.find();
    }

    public static void extractPricesAndShow(String string) {
        Pattern pattern = Pattern.compile("((\\d+\\.\\d{1,2})|(\\d+)) (RUB|EU|USD)");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Цена: " + string.substring(start,end));
        }
    }

    public static boolean isStringDate(String string) {
        Pattern pattern = Pattern.compile("(([012]\\d)|(3[01]))/((0[1-9])|(1[0-2]))/((19\\d{2})|([2-9]\\d{3}))");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean isStringEmail(String string) {
        Pattern pattern = Pattern.compile("([\\w.]+)@(\\w+)\\.(\\w+)");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static boolean isPasswordGood(String string) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])\\w{8,}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
