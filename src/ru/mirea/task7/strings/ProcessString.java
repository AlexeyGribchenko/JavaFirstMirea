package ru.mirea.task7.strings;

public class ProcessString implements StringFunctionality {
    @Override
    public int countSymbols(String str) {
        return str.length();
    }

    @Override
    public String getOddSymbolString(String str) {
        String newString = "";
        for (int i = 1; i < str.length(); i += 2) {
            newString += str.charAt(i);
        }
        return newString;
    }

    @Override
    public String reverse(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }
}
