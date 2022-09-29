package ru.mirea.task4.employeemanager;

public class Tester {
    public static void main(String[] args) {
        Employee man = new Manager("Alexey", "Gribchenko", 15000.0, 3000.0);
        System.out.println(man.getFullName() + ". Income: " + man.getIncome() + "\n");

        Employee[] employees = {
                new Employee("Victor", "Gerasimov", 27000.0),
                new Manager("Artem", "Kovalenko", 310000.0, 15000.0),
                new Employee("Konstantin", "Juravlev", 1500.0),
                new Manager("Orlov", "Daniil", 100000.0, 14999.0)
        };
        for (Employee e : employees) {
            System.out.println(e.getFullName() + ". Income: " + e.getIncome());
        }
    }
}