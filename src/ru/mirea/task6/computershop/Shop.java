package ru.mirea.task6.computershop;

import java.util.Vector;

public class Shop {
    private Vector<Computer> computers;

    public Shop() {
        computers = new Vector<Computer>(0);
    }

    public boolean find(Computer computer) {
        for (Computer c : computers) {
            if (c.equals(computer)) {
                System.out.println("Такой компьютер имеется в наличии.");
                return true;
            }
        }
        System.out.println("Такой компьютер не найден.");
        return false;
    }

    public void add(Computer computer) {
        computers.add(computer);
    }

    public void delete(int index) {
        computers.remove(index);
    }

    public Computer get(int index) {
        return computers.get(index);
    }

}
