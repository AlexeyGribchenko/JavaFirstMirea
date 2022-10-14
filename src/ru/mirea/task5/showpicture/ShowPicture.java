package ru.mirea.task5.showpicture;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowPicture {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        ImageFrame frame = new ImageFrame(fileName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ImageFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 960;
    public static final int DEFAULT_HEIGHT = 540;

    public ImageFrame(String fileName) {
        setTitle("PictureTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        ImageComponent component = new ImageComponent(fileName);
        add(component);
    }
}

class ImageComponent extends JComponent {
    private Image image;

    public ImageComponent(String fileName) {
        try {
            image = ImageIO.read(new File("C:\\Users\\_ADMIN_\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task5\\showpicture\\img\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        if (image == null) return;
        int imageWidth = image.getWidth(this) / 2;
        int imageHeight = image.getHeight(this) / 2;

        g.drawImage(image, 0, 0, imageWidth, imageHeight, null);
    }
}
