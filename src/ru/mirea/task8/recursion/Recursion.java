package ru.mirea.task8.recursion;

public class Recursion {

    static public boolean isSimple(int value, int divider) {
        if (divider > Math.sqrt(value)) {
            return true;
        }
        if (value % divider == 0) {
            return false;
        }
        return isSimple(value, divider + 1);
    }

    static public void simpleDividers(int value, int divider) {
        if (divider > value) {
            return;
        }
        if (value % divider == 0) {
            System.out.printf("%d ", divider);
            simpleDividers(value / divider, divider);
        } else {
            simpleDividers(value, divider + 1);
        }
    }

    static public boolean isPalindrome(String str, int index) {
        if (index >= str.length() / 2 - 1) {
            return str.charAt(index) == str.charAt(str.length() - 1 - index);
        }
        if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
            return false;
        } else {
            return isPalindrome(str, index + 1);
        }
    }

    static public int withoutZeros(int zeros, int units) {
        if (zeros == 0) return 1;
        if (zeros == 1) return units + 1;
        if (zeros > 0 && units == 0) return 0;
        return withoutZeros(zeros - 1, units - 1) + withoutZeros(zeros, units - 1);
    }

    static public int reverseNumber(int value1, int value2) {
        if (value1 / 10 == 0) return value2 * 10 + value1 % 10;
        else return reverseNumber(value1 / 10, value2 * 10 + value1 % 10);
    }
}
