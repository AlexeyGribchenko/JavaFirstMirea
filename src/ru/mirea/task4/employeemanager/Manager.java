package ru.mirea.task4.employeemanager;

public class Manager extends Employee {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }
    @Override
    public double getIncome() {
        return super.getIncome() + this.averageSum;
    }
}
