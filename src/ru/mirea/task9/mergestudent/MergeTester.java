package ru.mirea.task9.mergestudent;


public class MergeTester {
    public static void main(String[] args) {
        Student[] arrayA = {new Student(4), new Student(2), new Student(5)};
        Student[] arrayB = {new Student(7), new Student(6), new Student(1)};

        StudentNumberComparator comparator = new StudentNumberComparator();
        MergeStudents sort = new MergeStudents(comparator);
        Student[] newArray = sort.sort(arrayA, arrayB);
        for (Student x : newArray) {
            System.out.print(x.getAverageScore() + " ");
        }
    }
}