package ru.mirea.task5.resultmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultManager extends JFrame{

    private int milanScore;
    private int madridScore;
    private String winner;
    JLabel resultLabel;
    JLabel lastScorerLabel;
    JLabel winnerLabel;

    Container container;

    public ResultManager() {

        setTitle("ResultManager");
        setSize(new Dimension(400,300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 300));
        panel.setLayout(new GridLayout(2, 3, 3, 3));

        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");

        ActList a = new ActList();
        milan.addActionListener(a);
        madrid.addActionListener(a);

        panel.add(winnerLabel);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(milan);
        panel.add(new JLabel(""));
        panel.add(madrid);

        getContentPane().add(panel);
        pack();

        setVisible(true);
    }

    public class ActList implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String str = event.getActionCommand();
            if (str.equals("AC Milan")) {
                milanScore++;
            } else if (str.equals("Real Madrid")) {
                madridScore++;
            }
            if (milanScore > madridScore) {
                winner = "AC Milan";
            } else if (milanScore < madridScore) {
                winner = "Real Madrid";
            }
            winnerLabel.setText("Winner: " + winner);
            resultLabel.setText("Result " + milanScore + " X " + madridScore);
            lastScorerLabel.setText("Last Scorer: " + event.getActionCommand());
        }
    }

    public static void main(String[] args) {
        ResultManager resultManager = new ResultManager();
    }
}
