package ru.mirea.task19.studentexeption;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент с именем "+ name + " не найден!");
    }
}
