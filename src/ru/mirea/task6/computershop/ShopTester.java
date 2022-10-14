package ru.mirea.task6.computershop;

public class ShopTester {
    public static void main(String[] args) {

        Computer comp1 = new Computer(8, 8196, 17, Brands.HP, 87000);
        Computer comp2 = new Computer(6, 4096, 15, Brands.APPLE, 31000);
        Computer comp3 = new Computer(4, 2048, 14, Brands.ASUS, 27000);
        Shop shop = new Shop();
        shop.add(comp1);
        shop.add(comp2);
        shop.add(comp3);

        // find method testing
        shop.find(comp2);

        // delete method testing
        shop.delete(1);

        // find method testing
        shop.find(comp2);
    }
}
