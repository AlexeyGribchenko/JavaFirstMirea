package ru.mirea.task2.computershop;

import java.util.Vector;

public class Shop {
    private Vector<Computer> computerArray;

    public Shop() {
        computerArray = new Vector<Computer>();
    }

    public void addComputer(Computer computer) {
        this.computerArray.addElement(computer);
    }

    public void removeComputer(Computer computer) {
        this.computerArray.removeIf(c -> c.compare(computer));
    }

    public boolean findComputer(Computer computer) {
        for (Computer c : computerArray) {
            if (c.compare(computer)) {
                return true;
            }
        }
        return false;
    }

    public void printComputers() {
        for (Computer c : computerArray) {
            System.out.println(c);
        }
    }
}
