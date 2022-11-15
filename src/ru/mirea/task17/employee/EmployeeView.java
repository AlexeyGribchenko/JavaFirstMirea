package ru.mirea.task17.employee;

public class EmployeeView {

    public void printEmployeeDetails(String name, double salary, double extraMoney) {
        System.out.println("Employee details:");
        System.out.println("Employee`s name: " + name);
        System.out.println("Employee`s name: " + (salary + extraMoney));

    }
}
