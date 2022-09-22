package ru.mirea.task2.author;

import java.io.IOException;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) throws IOException {
        System.out.println("Create your own author");

        Scanner scanner = new Scanner(System.in);
        String name, email, newEmail;
        char gender;

        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.print("Enter gender: ");
        gender = (char) System.in.read();

        Author author = new Author(name, email, gender);
        System.out.println("Here is your author:");
        System.out.println(author);

        System.out.print("Let`s change author`s e-mail.\nEnter new email: ");
        newEmail = scanner.nextLine();
        author.setEmail(newEmail);

        System.out.print(author.getName() + "`s e-mail is: " + author.getEmail());
    }
}
