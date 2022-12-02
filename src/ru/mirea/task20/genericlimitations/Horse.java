package ru.mirea.task20.genericlimitations;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    public Horse(String name) {
        super(name);
    }
}
