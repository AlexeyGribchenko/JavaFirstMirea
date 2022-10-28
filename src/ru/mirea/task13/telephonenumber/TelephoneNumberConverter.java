package ru.mirea.task13.telephonenumber;

public class TelephoneNumberConverter {
    static public String convertTelephoneNumber(String telephoneNumber) {
        StringBuilder stringBuffer = new StringBuilder(telephoneNumber);
        if (stringBuffer.charAt(0) == '8') {
            stringBuffer.replace(0, 1, "+7");
        }
        stringBuffer.insert(1, '<');
        stringBuffer.insert(3, '>');
        stringBuffer.insert(4, '<');
        stringBuffer.insert(8, '>');
        stringBuffer.insert(9, '-');
        stringBuffer.insert(10, '<');
        stringBuffer.insert(14, '>');
        stringBuffer.insert(15, '-');
        stringBuffer.insert(16, '<');
        stringBuffer.insert(21, '>');

        return stringBuffer.toString();
    }
}
