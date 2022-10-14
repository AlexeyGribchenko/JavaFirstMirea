package ru.mirea.task6.printable;

public class PrintableTester {
    public static void main(String[] args) {
        Printable[] print = {
                new Book("Book 0"),
                new Book("Book 1"),
                new Shop("Shop 0"),
                new Book("Book 2"),
                new Shop("Shop 1"),
                new Shop("Shop 2")
        };
        for (Printable x : print) {
            x.print();
        }
    }
}