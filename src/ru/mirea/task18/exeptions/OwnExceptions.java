package ru.mirea.task18.exeptions;

public class OwnExceptions {

    public static void getDetails1(String key) {
        try {
            System.out.println(key.length());
        } catch (NullPointerException e) {
            System.err.println("null key in getDetails1");
        }

    }

    public static String getDetails2(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails2");
        }
        return "data for " + key;
    }

    public static void printMessage(String key) {
        String message = getDetails2(key);
        System.out.println(message);
    }

    public static void exception4() {

    }

    public static void exception5() {

    }

    public static void main(String[] args) {
        getDetails1(null);
        printMessage("Biba and Boba");
        try {
            printMessage(null);
        } catch (NullPointerException e) {
            System.err.println("null key in printMessage");
        }
        TrowsDemo trowsDemo = new TrowsDemo();
        //trowsDemo.getKey();

        trowsDemo.getKey2();
    }
}
