package ru.mirea.task4.studentpupil;

public class Tester {
    public static void main(String[] args) {
        Learner[] learners = {
                new Learner("Alexey"),
                new Student("Dmitry"),
                new Pupil("Victor"),
                new Student("Konstantin"),
                new Pupil("Artem")
        };
        for (Learner l : learners) {
            if (l instanceof Student) {
                System.out.println(l + " is Student");
            } else if (l instanceof Pupil) {
                System.out.println(l + " is Pupil");
            }
        }
    }
}
