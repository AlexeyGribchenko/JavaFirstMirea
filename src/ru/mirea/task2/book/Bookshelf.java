package ru.mirea.task2.book;

import java.util.Scanner;

public class Bookshelf {
    private Book[] bookshelf;
    private int bookshelfSize;

    public Bookshelf(int bookshelfSize) {

        this.bookshelfSize = bookshelfSize;
        this.bookshelf = new Book[bookshelfSize];

        Scanner sc = new Scanner(System.in);
        String title;
        int releaseYear, price;

        System.out.println("Filling bookshelf");
        for (int i = 0; i < bookshelfSize; i++) {

            System.out.print("Enter title: ");
            title = sc.nextLine();

            System.out.print("Enter release year: ");
            releaseYear = sc.nextInt();

            System.out.print("Enter price: ");
            price = sc.nextInt();
            sc.skip("\n");

            bookshelf[i] = new Book(title, releaseYear, price);
        }
    }

    public boolean isEmpty() {
        return this.bookshelfSize == 0;
    }

    public Book findLatestBook() {

        Book latest = bookshelf[0];

        for (int i = 1; i < bookshelfSize; i++) {
            if (bookshelf[i].getReleaseYear() > latest.getReleaseYear()) {
                latest = bookshelf[i];
            }
        }
        return latest;
    }

    public Book findEarliestBook() {

        Book earliest = bookshelf[0];

        for (int i = 1; i < bookshelfSize; i++) {
            if (bookshelf[i].getReleaseYear() < earliest.getReleaseYear()) {
                earliest = bookshelf[i];
            }
        }
        return earliest;
    }

    public void sort() {

        for (int i = 0; i < bookshelfSize; i++) {
            for (int j = i + 1; j < bookshelfSize; j++) {
                if (bookshelf[j].getReleaseYear() < bookshelf[i].getReleaseYear()) {
                    Book tmp = bookshelf[i];
                    bookshelf[i] = bookshelf[j];
                    bookshelf[j] = tmp;
                }
            }
        }
    }
    public void print() {
        for (Book b : bookshelf) {
            System.out.println(b);
        }
    }

}
