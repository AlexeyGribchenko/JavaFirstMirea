package ru.mirea.task21.anytypestorage;

public class AnyTypeStorage {

    private Object[] elements;
    private int size;

    AnyTypeStorage(int size) {
        this.size = size;
        this.elements = new Object[size];
    }

    public void setElementAt(int index, Object e) {
        if (index < 0 || index > this.size) {
            throw  new IndexOutOfBoundsException("Выход за границы массива");
        } else {
            this.elements[index] = e;
        }
    }

    public Object elementAt(int index) {
        if (index < 0 || index > this.size) {
            throw  new IndexOutOfBoundsException("Выход за границы массива");
        } else {
            return elements[index];
        }
    }

    public static void main(String[] args) {
        AnyTypeStorage storage = new AnyTypeStorage(4);
        storage.setElementAt(0, "Hello");
        storage.setElementAt(1, 123);
        storage.setElementAt(2, 456.7);
        storage.setElementAt(3, true);

        for (int i = 0; i < 4; i++) {
            System.out.println(storage.elementAt(i).getClass() + "   " + storage.elementAt(i));
        }
    }
}
