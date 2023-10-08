package ru.mirea.lab5;
import javax.swing.*;
import java.awt.*;

public class task1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("REAL X MIlAN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(300,300));
        panel.setLayout(new BorderLayout());

        JLabel label1 = new JLabel("Result: 0 X 0");
        label1.setLocation(150,0);
        JLabel label2 = new JLabel("Last Scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");
        panel.add(label1, BorderLayout.NORTH);
        panel.add(label2, BorderLayout.CENTER);
        panel.add(label3, BorderLayout.SOUTH);

        JButton button1 = new JButton("AC Milan");
        button1.setPreferredSize(new Dimension(100,300));
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1, BorderLayout.EAST);
        panel.add(button2, BorderLayout.WEST);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
