package ru.mirea.task10.student;


import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGroup() > o2.getGroup())
            return 1;
        if(o1.getGroup() < o2.getGroup())
            return -1;
        return 0;
    }
}