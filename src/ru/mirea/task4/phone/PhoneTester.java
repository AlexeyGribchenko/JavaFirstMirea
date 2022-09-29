package ru.mirea.task4.phone;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+78005553535", "iphone", 210);
        Phone phone2 = new Phone("+79005477831", "xiaomi", 180);
        Phone phone3 = new Phone("+79506439694", "samsung", 300);

        System.out.println("\nPhone1: " + phone1);
        System.out.println("Phone2: " + phone2);
        System.out.println("Phone3: " + phone3);

        System.out.println("\nFirst phone`s number: " + phone1.getNumber()); phone1.receiveCall("Dima");
        System.out.println("Second phone`s number: " + phone2.getNumber()); phone2.receiveCall("Daya");
        System.out.println("Third phone`s number: " + phone3.getNumber()); phone3.receiveCall("Alexey");

        phone1.receiveCall("\nDima", "+79506439694");
        phone2.receiveCall("Daya", "+79005477831");
        phone3.receiveCall("Alexey", "+78005553535");

        System.out.println();
        phone1.sendMessage("Hello friend", new String[]{"+79506439694", "+79005477831", "+78005553535"});
    }
}
