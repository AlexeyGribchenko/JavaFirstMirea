package ru.mirea.task2.howmany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words: ");
        String string = sc.nextLine();
        String[] strArray = string.split(" ");
        System.out.println(strArray.length);
    }
}
