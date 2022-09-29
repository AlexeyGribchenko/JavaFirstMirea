package ru.mirea.task4.libraryreaders;

public class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String birthdayDate;
    private String telephoneNumber;

    public Reader(String fullName, int readerTicketNumber, String faculty, String birthdayDate, String telephoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.birthdayDate = birthdayDate;
        this.telephoneNumber = telephoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(this.fullName + " has taken " + numberOfBooks + " books.");
    }

    public void takeBook(String[] books) {
        System.out.print(this.fullName + " has taken books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i != books.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public void takeBook(Book[] books) {
        System.out.print(this.fullName + " has taken books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if (i != books.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(this.fullName + " has returned " + numberOfBooks + " books.");
    }

    public void returnBook(String[] books) {
        System.out.print(this.fullName + " has returned books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i != books.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public void returnBook(Book[] books) {
        System.out.print(this.fullName + " has returned books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if (i != books.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
