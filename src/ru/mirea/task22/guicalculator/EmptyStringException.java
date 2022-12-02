package ru.mirea.task22.guicalculator;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("Empty string not allowed");
    }
}