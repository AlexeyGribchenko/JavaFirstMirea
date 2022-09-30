package ru.mirea.task4.atelier;

public class Atelier {

    public void dressMan(Clothes[] clothes) {
        System.out.println("These clothes can be worn on a man:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                System.out.println(c);
            }
        }
    }
    public void dressWoman(Clothes[] clothes) {
        System.out.println("These clothes can be worn on a woman:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                System.out.println(c);
            }
        }
    }
}
