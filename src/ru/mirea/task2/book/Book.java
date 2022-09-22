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

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + " Release year: " + this.releaseYear + " Price: " + this.price;
    }
}
