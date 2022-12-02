package ru.mirea.task20.genericlimitations;

import java.io.Serializable;

public class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
