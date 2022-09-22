package ru.mirea.task2.swapstring;

import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        String[] stringArray;
        int arraySize;
        String tmpString;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        arraySize = sc.nextInt();
        sc.skip("\n");

        stringArray = new String[arraySize];
        System.out.println("Fill string array.");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter string №" + (i + 1) + ": ");
            stringArray[i] = sc.nextLine();
        }

        for (int i = 0; i < arraySize / 2; i++) {
            tmpString = stringArray[i];
            stringArray[i] = stringArray[arraySize - i - 1];
            stringArray[arraySize - i - 1] = tmpString;
        }

        System.out.println("Reversed array:");
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
