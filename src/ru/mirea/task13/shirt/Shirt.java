package ru.mirea.task13.shirt;

public class Shirt {
    private String code, name, color, size;

    public Shirt(String s){
        String[] shirts = s.split(",");
        code = shirts[0];
        name = shirts[1];
        color = shirts[2];
        size = shirts[3];
    }

    @Override
    public String toString() {
        return "Shirt {" +
                "code: " + code + ',' +
                " name: " + name + ',' +
                " color: " + color + ',' +
                " size: " + size + '}';
    }
}

