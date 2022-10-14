package ru.mirea.task6.computershop;

public class Computer {
    private Processor processor;
    private Memory memory;
    protected Monitor monitor;
    protected Brands brand;
    protected int price;

    public Computer(int cores, int capacity, int diagonal, Brands brand, int price) {
        this.processor = new Processor(cores);
        this.memory = new Memory(capacity);
        this.monitor = new Monitor(diagonal);
        this.brand = brand;
        this.price = price;
    }

    public Processor getCpu() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Brands getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.print("Количество ядер: " + processor.getCores() +
                " Диагональ экрана: " + monitor.getDiagonal() + " Объём ОЗУ: " + memory.getCapacity() + " Бренд: ");
        switch (brand) {
            case HUAWEI:
                System.out.println("Dell");
                break;
            case APPLE:
                System.out.println("Apple");
                break;
            case HP:
                System.out.println("Msi");
                break;
            case ASUS:
                System.out.println("Asus");
                break;
        }
    }
}
