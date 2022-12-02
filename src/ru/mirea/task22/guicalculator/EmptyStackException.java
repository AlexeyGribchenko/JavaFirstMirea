package ru.mirea.task22.guicalculator;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Stack is empty! Retry with another expression");
    }
}