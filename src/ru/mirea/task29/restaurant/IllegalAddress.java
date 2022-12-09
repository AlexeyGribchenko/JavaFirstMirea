package ru.mirea.task29.restaurant;

public class IllegalAddress extends Error{
    public IllegalAddress(String address){
        super("There is no such address " + address);
    }
}