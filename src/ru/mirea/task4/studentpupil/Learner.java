package ru.mirea.task4.studentpupil;

public class Learner {
    private String name;

    public Learner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
