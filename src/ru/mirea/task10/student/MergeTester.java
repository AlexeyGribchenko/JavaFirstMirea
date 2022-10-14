package ru.mirea.task10.student;


import java.util.Comparator;

public class MergeTester
{
    public static void main(String[] args)
    {
        Student[] arrayA = {new Student("Student1" , "Student1", "Information Technology", 2, 2),
                new Student("Student2" , "Student2", "Chemistry", 1, 1),
                new Student("Student3" , "Student3", "Business", 2, 33) };
        Student[] arrayB = {new Student("Student4" , "Student4", "Mathematics", 2, 13),
                new Student("Student5" , "Student5", "Information Technology", 3, 5),
                new Student("Student6" , "Student6", "Chemistry", 4, 3)};

        Comparator<Student> comparator = new StudentCourseComparator().thenComparing(new StudentGroupComparator());
        MergeStudents sort = new MergeStudents(comparator);
        Student[] newArray = sort.sort(arrayA, arrayB);
        for(Student x : newArray)
        {
            System.out.println(x);
        }
    }
}