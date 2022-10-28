package ru.mirea.task5.animation;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class Animation extends JFrame {
    int WINDOW_WIDTH = 793;
    int WINDOW_HEIGHT = 400;
    String animation_images_path = "C:\\Users\\_ADMIN_\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task5\\animation\\img";

    Animation() {
        super("Animation");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        animate(this.animation_images_path, g);
    }

    void animate(String frames_path, Graphics2D g) {

        File dir = new File(frames_path);

        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

            try {
                Thread.sleep(45);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}