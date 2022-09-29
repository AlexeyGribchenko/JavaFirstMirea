package ru.mirea.task4.employeemanager;

public class Employee {
    private String firstName;
    private String lastName;
    private double income;

    public Employee(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return this.income;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
