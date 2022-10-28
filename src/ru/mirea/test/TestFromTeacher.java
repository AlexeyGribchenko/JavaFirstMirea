package ru.mirea.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TestFromTeacher extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonPlus = new JButton("Сложить числа");
    JButton buttonMinus = new JButton("Вычесть из первого второе");
    JButton buttonDivide = new JButton("Разделить первое на второе");
    JButton buttonMultiply = new JButton("Умножить числа");

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    TestFromTeacher() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 250);
        add(new JLabel("1st number"));
        add(jta1);
        add(new JLabel("2nd number"));
        add(jta2);
        add(buttonPlus);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1+x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setVisible(true);

        add(buttonMinus);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1-x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setVisible(true);

        add(buttonMultiply);
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1*x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setVisible(true);

        add(buttonDivide);
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1/x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestFromTeacher();
    }
}
