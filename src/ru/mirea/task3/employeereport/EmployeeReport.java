package ru.mirea.task3.employeereport;

public class EmployeeReport {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Gribchenko Alexey Yurievich", 210000.0),
                new Employee("Kolganov Dmitry Sergeevich", 15000.0),
                new Employee("Orlov Daniil Dmitrievich", 340000.0),
                new Employee("Ivanov Ivan Ivanovich", 1000.0)
        };
        Report.generateReport(employees);
    }
}
