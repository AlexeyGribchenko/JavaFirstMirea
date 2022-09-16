package ru.mirea.task3.book;

public class Book {
    private String title;
    private String author;
    private String writingYear;

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public String getWritingYear() {
        return writingYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setWritingYear(String writingYear) {
        this.writingYear = writingYear;
    }

    Book() {
        this.title = "Empty";
        this.author = "Empty";
        this.writingYear = "Empty";
    }

    Book(String title, String author, String writingYear) {
        this.title = title;
        this.author = author;
        this.writingYear = writingYear;
    }

    public String toString() {
        return "Title: " + this.title + "; Author: " + this.author + "; Year of writing: " + this.writingYear + '.';
    }
}
