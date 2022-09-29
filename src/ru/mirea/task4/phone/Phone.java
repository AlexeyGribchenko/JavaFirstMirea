package ru.mirea.task4.phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() {
        this.number = "number";
        this.model = "model";
        this.weight = 0;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("{" + name + "} is calling.");
    }

    public void receiveCall(String name, String number) {
        System.out.println("{" + name + "} is calling. (" + number + ")");
    }

    public void sendMessage(String message, String[] numbers) {
        for (String number : numbers) {
            System.out.println("Message \"" + message + "\" sent to: " + number);
        }
    }

    @Override
    public String toString() {
        return "Number: "
                + this.number
                + "\tModel: "
                + this.model
                + "\tWeight"
                + this.weight;
    }
}
