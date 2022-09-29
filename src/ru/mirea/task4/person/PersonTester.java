package ru.mirea.task4.person;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Gribchenko Alexey Yurievich", 19);

        person1.move();
        person1.talk();

        System.out.println();
        person2.move();
        person2.talk();
    }
}
