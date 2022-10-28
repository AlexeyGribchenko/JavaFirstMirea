package ru.mirea.task16.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;


class Game extends JFrame {
    JButton tryButton = new JButton("Угадать!");
    JTextField numberField = new JTextField();
    JLabel jLabel = new JLabel("Попробуй угадать число от 0 до 20");
    int guessNumber = (int)(Math.random() * 20);
    int clickCount = 0;

    public Game() {
        super("Guess game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel grid = new JPanel(new GridLayout(3, 1, 5, 0));
        grid.add(jLabel);
        grid.add(numberField);
        grid.add(tryButton);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(grid);

        Container window = getContentPane();
        window.add(flowButton);

        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNumber = Integer.parseInt(numberField.getText());
                if (userNumber == guessNumber) {
                    jLabel.setText("Ты выиграл!");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                } else {
                    if (userNumber < guessNumber) {
                        jLabel.setText("Загаданное число больше");
                    } else {
                        jLabel.setText("Загаданное число меньше");
                    }
                }
                clickCount++;
                if (clickCount == 3 && userNumber != guessNumber) {
                    jLabel.setText("Попытки закончились :(");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}