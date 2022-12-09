package ru.mirea.task29.restaurant;

public class IllegalTableNumber extends Error {
    public IllegalTableNumber(String address){
        super("There is no table with such address" + address);
    }
}
