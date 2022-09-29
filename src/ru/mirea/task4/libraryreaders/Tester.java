package ru.mirea.task4.libraryreaders;

public class Tester {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Gerasimov Victor Dmitrievich",
                        69,
                        "Information technologies",
                        "21.12.2002",
                        "+78005553535"),
                new Reader("Juravlev Konstantin Anatolievich",
                        1547,
                        "Information technologies",
                        "28.06.2003",
                        "+74736109812"),
                new Reader("Gribchenko Alexey Yurievich",
                        1245,
                        "Information technologies",
                        "28.06.2003",
                        "+71298356478")
        };

        readers[0].takeBook(3);
        readers[0].returnBook(3);

        System.out.println();
        readers[1].takeBook(new String[]{"The Witcher", "Made in Abyss", "War and piece"});
        readers[1].returnBook(new String[]{"The Witcher", "Made in Abyss", "War and piece"});

        System.out.println();
        Book[] books = {
                new Book("Scarlet sails", "Alexandr Green"),
                new Book("The lord of the Flies", "William Golding"),
                new Book("Dandelion Wine", "Bradbury")
        };
        readers[2].takeBook(books);
        readers[2].returnBook(books);
    }
}
