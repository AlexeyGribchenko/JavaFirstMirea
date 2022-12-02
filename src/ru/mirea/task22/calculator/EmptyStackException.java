package ru.mirea.task22.calculator;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Stack is empty");
    }
}