package ru.mirea.task17.employee;

public class Employee {

    private String name;
    private double salary;
    private double extraMoney;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getExtraMoney() {
        return extraMoney;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExtraMoney(double extraMoney) {
        this.extraMoney = extraMoney;
    }
}
