package ru.mirea.task4.person;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "fullName";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Person: " + this.fullName + " is moving.");
    }

    public void talk() {
        System.out.println("Person: " + this.fullName + " is talking.");
    }
}
