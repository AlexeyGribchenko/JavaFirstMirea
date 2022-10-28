package ru.mirea.task15.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Calculator extends JFrame {
    JTextField jTextArea1 = new JTextField(10);
    JTextField jTextArea2 = new JTextField(10);
    JButton jButtonPlus = new JButton("Сложить числа");
    JButton jButtonMinus = new JButton("Вычесть из первого второе");
    JButton jButtonDivide = new JButton("Разделить первое на второе");
    JButton jButtonMultiply = new JButton("Умножить числа");

    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Calculator() {
        super("Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 250);
        add(new JLabel("1st number"));
        add(jTextArea1);
        add(new JLabel("2nd number"));
        add(jTextArea2);
        add(jButtonPlus);
        jButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jTextArea1.getText());
                    double x2 = Double.parseDouble(jTextArea2.getText());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1+x2));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers");
                }
            }
        });

        add(jButtonMinus);
        jButtonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jTextArea1.getText());
                    double x2 = Double.parseDouble(jTextArea2.getText());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1-x2));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers");
                }
            }
        });

        add(jButtonMultiply);
        jButtonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jTextArea1.getText());
                    double x2 = Double.parseDouble(jTextArea2.getText());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1*x2));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers");
                }
            }
        });

        add(jButtonDivide);
        jButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jTextArea1.getText());
                    double x2 = Double.parseDouble(jTextArea2.getText());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1/x2));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in numbers");
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}