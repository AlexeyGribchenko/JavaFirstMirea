package ru.mirea.task32.bar;

import java.io.Serializable;

public final class Drink extends MenuItem implements Alcoholable, Serializable {
    private final DrinkTypeEnum type;
    private final double alcoholVol;

    public Drink(String name, String description, int cost, DrinkTypeEnum type, double alcoholVol) {
        super(name, description, cost);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public String toString() {
        return " " + getName() + " " + getDescription() + " " + getCost();
    }
}