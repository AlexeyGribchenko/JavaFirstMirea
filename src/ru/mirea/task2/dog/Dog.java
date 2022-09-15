package ru.mirea.task2.dog;

public class Dog {

    private String name;
    private int age;

    public Dog() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void intoHumanAge() {
        System.out.println(this.name + "`s age in human years is " + (this.age * 7));
    }

    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}
