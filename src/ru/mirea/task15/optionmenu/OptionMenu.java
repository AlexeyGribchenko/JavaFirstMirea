package ru.mirea.task15.optionmenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionMenu extends JFrame {

    OptionMenu() {

        super("Option menu");

        String[] optionsToChoose = {"Russia", "China", "Japan", "Australia"};
        String[] countryDescription = {
                "Russia is the largest country in the world",
                "China has more people than any other county",
                "Japan surrounded by sea from every side",
                "I`m afraid of going to Australia because of the spiders"
        };

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(80, 50, 140, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(30, 100, 400, 100);
        jLabel.setText(countryDescription[0]);

        add(jComboBox);
        add(jLabel);

        setLayout(null);
        setSize(350, 250);
        setVisible(true);

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = countryDescription[jComboBox.getSelectedIndex()];
                jLabel.setText(description);
            }
        });
    }

    public static void main(String[] args) {
        new OptionMenu();
    }
}