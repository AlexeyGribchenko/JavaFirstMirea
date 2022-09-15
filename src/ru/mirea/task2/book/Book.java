package ru.mirea.task2.book;

public class Book {

    private int price;
    private int releaseYear;
    private String title;

    public Book() {
        this.title = "Unknown";
        this.releaseYear = 0;
        this.price = 0;
    }

    public Book(String title, int releaseYear, int price) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String toString() {
        return "Title: " + this.title + "\nRelease year: " + this.releaseYear + "\nPrice: " + this.price;
    }
}
