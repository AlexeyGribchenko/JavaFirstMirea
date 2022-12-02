package ru.mirea.task22.guicalculator;

public class DoubleParseException extends Exception{
    public DoubleParseException(){
        super("Wrong value! Try another expression");
    }
}