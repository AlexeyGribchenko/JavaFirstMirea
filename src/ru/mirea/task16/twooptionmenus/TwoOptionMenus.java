package ru.mirea.task16.twooptionmenus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TwoOptionMenus extends JFrame {

    TwoOptionMenus() {

        super("Option menu");

        String[] colorsToChoose = {"Синий", "Красный", "Черный"};
        String[] fontsToChoose = {"Times  New  Roman", "MS  Sans  Serif", "Courier New"};
        Color[] colors = {Color.BLUE, Color.RED, Color.BLACK};
        Font[] fonts = {
                new Font(fontsToChoose[0], Font.BOLD, 14),
                new Font(fontsToChoose[1], Font.BOLD, 14),
                new Font(fontsToChoose[2], Font.BOLD, 14),
        };
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> jComboColorBox = new JComboBox<>(colorsToChoose);
        jComboColorBox.setBounds(10, 50, 100, 20);

        JComboBox<String> jComboFontBox = new JComboBox<>(fontsToChoose);
        jComboFontBox.setBounds(120, 50, 150, 20);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(17, 100, 300, 100);

        add(jComboColorBox);
        add(jComboFontBox);
        add(jTextArea);

        setLayout(null);
        setSize(350, 250);
        setVisible(true);

        jComboColorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(colors[jComboColorBox.getSelectedIndex()]);
            }
        });

        jComboFontBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(fonts[jComboFontBox.getSelectedIndex()]);
            }
        });
    }

    public static void main(String[] args) {
        new TwoOptionMenus();
    }
}