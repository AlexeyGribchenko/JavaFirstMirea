package ru.mirea.task32.bar;

import java.io.Serializable;

public interface Alcoholable extends Serializable {
    boolean isAlcoholicDrink();
    double getAlcoholVol();
}