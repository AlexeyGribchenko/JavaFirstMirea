package ru.mirea.task2.book;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Witcher. The last wish.", 1993, 400);

        System.out.println(book1);
        System.out.println(book2);
    }
}
