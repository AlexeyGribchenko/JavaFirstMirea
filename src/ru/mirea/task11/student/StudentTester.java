package ru.mirea.task11.student;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentTester {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MM yyyy");
        Student student1 = new Student("Витя", "Герасимов", 2, dateFormat.parse("21 12 2002"));
        Student student2 = new Student("Костя", "Журавлёв", 2, dateFormat.parse("28 06 2003"));
        Student student3 = new Student("Артём", "Коваленко", 2, dateFormat.parse("11 02 2003"));

        System.out.println(student1.toString(DateFormatEnum.SHORT));
        System.out.println(student2.toString(DateFormatEnum.MEDIUM));
        System.out.println(student3.toString(DateFormatEnum.LONG));
    }
}
