package ru.mirea.task4.author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("Create your own author");

        Scanner scanner = new Scanner(System.in);
        String name, email;
        char gender;

        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.print("Enter gender: ");
        gender = scanner.next().charAt(0);

        Author author = new Author(name, email, gender);
        System.out.println("Here is your author:");
        System.out.println(author);
    }
}
