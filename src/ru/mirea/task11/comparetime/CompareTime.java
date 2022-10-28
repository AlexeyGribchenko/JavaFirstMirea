package ru.mirea.task11.comparetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareTime {
    public static void main(String[] args) {
        Date systemDate = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("H:mm d.M.yyy");

        System.out.println("Введите дату в формате: hh:mm d.M.yyyy\nгде h - часы, m - минуты, d - день месяца, M - месяц, y - год");
        Scanner sc = new Scanner(System.in);

        String inputDateStr = sc.nextLine();
        try {

            Date inputDate = dateFormatter.parse(inputDateStr);
            System.out.println(dateFormatter.format(inputDate));

            if (inputDate.before(systemDate)) {
                System.out.println("Введенная дата раньше чем текущая дата системы.");
            } else {
                System.out.println("Введенная дата позже чем текущая дата системы.");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
