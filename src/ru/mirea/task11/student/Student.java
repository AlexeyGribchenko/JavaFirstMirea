package ru.mirea.task11.student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private int course;

    private Date birthday;

    public Student(String name, String surname,  int course, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String toString(DateFormatEnum format) {
        SimpleDateFormat shortFormat = new SimpleDateFormat("M.yy");
        SimpleDateFormat mediumFormat = new SimpleDateFormat("d.M.yy");
        SimpleDateFormat longFormat = new SimpleDateFormat("d.M.yyyy");
        if (format == DateFormatEnum.SHORT) {
            return name + " " + surname + " " + course + " " + shortFormat.format(birthday);
        }
        if (format == DateFormatEnum.MEDIUM) {
            return name + " " + surname + " " + course + " " + mediumFormat.format(birthday);
        }
        if (format == DateFormatEnum.LONG) {
            return name + " " + surname + " " + course + " " + longFormat.format(birthday);
        }
        return name + " " + surname + " " + course + " " + shortFormat.format(birthday);
    }
}