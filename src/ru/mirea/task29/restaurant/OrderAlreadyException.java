package ru.mirea.task29.restaurant;

public class OrderAlreadyException extends Exception{
    public OrderAlreadyException(String address){
        super("The order for " + address + " is added!");
    }
}