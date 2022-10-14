package ru.mirea.task5.randomfigures;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {

    Rectangle(int xLimit, int yLimit) {
        super(xLimit, yLimit);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graph = (Graphics2D) g;
        Rectangle2D comp = new Rectangle2D.Double(xPos, yPos, width, height);
        graph.setColor(color);
        graph.fill(comp);
        graph.draw(comp);
    }
}
