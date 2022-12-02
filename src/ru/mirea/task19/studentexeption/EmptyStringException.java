package ru.mirea.task19.studentexeption;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Передана пустая строка");
    }
}