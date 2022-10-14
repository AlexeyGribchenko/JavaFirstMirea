package ru.mirea.task9.sortstudents;

import ru.mirea.task9.mergestudent.Student;

public class SortTester {
    public static void main(String[] args) {
        Student[] arr = {new Student(4.2), new Student(2.8), new Student(5.0), new Student(4.3), new Student(3.7)};
        StudentNumberComparator comparator = new StudentNumberComparator();
        SortingStudentsByGPA sort = new SortingStudentsByGPA(comparator);
        sort.sort(arr);
        for (Student x : arr) {
            System.out.print(x.getAverageScore() + " ");
        }
    }
}
