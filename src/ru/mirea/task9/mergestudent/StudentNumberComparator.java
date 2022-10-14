package ru.mirea.task9.mergestudent;


import java.util.Comparator;

public class StudentNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() > o2.getAverageScore())
            return 1;
        if (o1.getAverageScore() < o2.getAverageScore())
            return -1;
        return 0;
    }
}