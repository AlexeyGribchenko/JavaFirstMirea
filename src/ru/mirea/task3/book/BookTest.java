package ru.mirea.task3.book;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book("The Witcher. Last wish", "Sapkowski", "1990");
        System.out.println(book1);

        System.out.println("Now you can set your own properties, which one do you want to change?\n1) Title\n2) Author\n3) Year of writing \n4) All");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        String title, author, writingYear;

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Title: ");
                title = scanner.nextLine();
                book1.setTitle(title);
            }
            case 2 -> {
                System.out.print("Enter author: ");
                author = scanner.nextLine();
                book1.setAuthor(author);
            }
            case 3 -> {
                System.out.print("Enter writing year: ");
                writingYear = scanner.nextLine();
                book1.setWritingYear(writingYear);
            }
            case 4 -> {
                System.out.print("Enter Title: ");
                title = scanner.nextLine();
                System.out.print("Enter author: ");
                author = scanner.nextLine();
                System.out.print("Enter writing year: ");
                writingYear = scanner.nextLine();


                book1.setTitle(title);
                book1.setAuthor(author);
                book1.setWritingYear(writingYear);
            }
            default -> {
            }
        }
        System.out.println("Book with new properties:");
        System.out.println(book1);
    }
}
