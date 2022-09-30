package ru.mirea.task4.atelier;

public class AtelierTester {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.L, 3500.0, "Green"),
                new Tie(Sizes.M, 700.0, "Black"),
                new Pants(Sizes.M, 2300, "Red"),
                new Skirt(Sizes.S, 3199.0, "Pink")
        };

        Atelier atelier = new Atelier();

        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}
