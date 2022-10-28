package ru.mirea.task13.address;

public class AddressTester {
    public static void main(String[] args) {
        Address address1 = new Address("Russia,Moscow region,Moscow,11th Parkovaya,36,2,1212");
        Address address2 = new Address("Russia;Bryansk region;Pogar;Shevchenko;10;1;1", ";");
        Address address3 = new Address("Russia,Murmansk region,Murmansk,Pushkina,134,4,892");
        Address address4 = new Address("Russia.Donetsk region.Torez.Gagarina.48.3.145", ".");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}
