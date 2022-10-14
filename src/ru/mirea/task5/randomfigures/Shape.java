package ru.mirea.task5.randomfigures;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JComponent {
    protected double xPos;
    protected double yPos;
    protected Color color;
    protected double width;
    protected double height;

    Shape(int xLimit, int yLimit) {
        Random random = new Random();
        this.xPos = random.nextInt((int)(xLimit * 0.8));
        this.yPos =  random.nextInt((int)(yLimit * 0.8));
        this.width = random.nextInt(xLimit / 10, xLimit / 4);
        this.height = random.nextInt(yLimit / 10, yLimit / 4);
        int colorIndex = random.nextInt(5);
        switch (colorIndex) {
            case 0 -> this.color = Color.BLUE;
            case 1 -> this.color = Color.GREEN;
            case 2 -> this.color = Color.RED;
            case 3 -> this.color = Color.magenta;
            case 4 -> this.color = Color.YELLOW;
        }
    }

    Shape(double xPos, double yPos, double width, double height, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
    }
}
