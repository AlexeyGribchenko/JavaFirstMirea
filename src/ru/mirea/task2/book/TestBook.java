package ru.mirea.task2.book;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bookshelfSize;
        System.out.print("Enter size of bookshelf: ");
        bookshelfSize = sc.nextInt();

        Bookshelf bookshelf = new Bookshelf(bookshelfSize);

        System.out.println("\nThe latest released book:\n" + bookshelf.findLatestBook());
        System.out.println("\nThe earliest released book:\n" + bookshelf.findEarliestBook() + '\n');

        System.out.println("Sorted bookshelf:");
        bookshelf.sort();
        bookshelf.print();
    }
}
