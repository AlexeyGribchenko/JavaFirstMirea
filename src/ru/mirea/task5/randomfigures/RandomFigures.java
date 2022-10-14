package ru.mirea.task5.randomfigures;


import javax.swing.*;
import java.util.Random;

public class RandomFigures
{
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    public static void main(String[] args)
    {
        JFrame window = new JFrame("RandomFigures");
        window.setSize(800, 600);
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            if (random.nextInt(2) == 1) {
                window.add(new Ellipse(WIDTH, HEIGHT));
            } else {
                window.add(new Rectangle(WIDTH, HEIGHT));
            }
            window.setVisible(true);
        }
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}