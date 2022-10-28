package ru.mirea.task11.tasktime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskTime {
    public static void main(String[] args) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("H:mm EEEE d MMMM yyyy");

        Date date = null;

        try {
            date = dateFormatter.parse("9:30 пятница 2 сентября 2022");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Разработчик: Грибченко А. Ю.");
        System.out.println("Дата и время получения задания");
        System.out.println(dateFormatter.format(date));

        date = new Date();
        System.out.println("Дата и время сдачи задания");
        System.out.println(dateFormatter.format(date));
    }
}
