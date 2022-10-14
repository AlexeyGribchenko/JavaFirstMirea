package ru.mirea.task5.randomfigures;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape {

    Ellipse(int xLimit, int yLimit) {
        super(xLimit, yLimit);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D) g;
        Ellipse2D comp = new Ellipse2D.Double(xPos, yPos, width, height);
        graph.setColor(color);
        graph.fill(comp);
    }
}