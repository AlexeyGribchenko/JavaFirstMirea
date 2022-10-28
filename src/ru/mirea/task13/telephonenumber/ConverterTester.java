package ru.mirea.task13.telephonenumber;

public class ConverterTester {
    public static void main(String[] args) {
        String number1 = "88005553535";
        String number2 = "+79506996439";
        System.out.println(TelephoneNumberConverter.convertTelephoneNumber(number1));
        System.out.println(TelephoneNumberConverter.convertTelephoneNumber(number2));
    }
}
