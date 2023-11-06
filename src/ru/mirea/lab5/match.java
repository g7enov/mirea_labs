package ru.mirea.lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class match{
    private int counter_milan = 0;
    private int counter_real  = 0;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("1")){
                label1.setText("Last Scorer: AC Milan");
                counter_milan ++;
            } else if (e.getActionCommand().equals("2")) {
                label1.setText("Last Scorer: Real Madrid");
                counter_real ++;
            }
            if(counter_real > counter_milan){
                label2.setText("Winner: Real Madrid");
            }else if(counter_real < counter_milan){
                label2.setText("Winner: AC Milan");
            }else{
                label2.setText("Winner: DRAW");
            }
            label3.setText(String.format("Result: %d X %d", counter_milan, counter_real));
        }
    }
    public match(){
        JFrame frame = new JFrame("window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener button_listener = new Listener();

        JButton button_M = new JButton("AC Milan");
        button_M.setActionCommand("1");
        button_M.addActionListener(button_listener);

        JButton button_R = new JButton("Real Madrid");
        button_R.setActionCommand("2");
        button_R.addActionListener(button_listener);

        label1 = new JLabel("Last Scorer: N/A");
        label2 = new JLabel("Winner: DRAW");
        label3 = new JLabel(String.format("Result: %d X %d", counter_milan, counter_real));

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(400, 200));
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);

        JPanel panel2 = new JPanel();
        panel2.add(button_M);
        panel2.add(button_R);

        frame.getContentPane().add(BorderLayout.NORTH, panel1);
        frame.getContentPane().add(BorderLayout.SOUTH, panel2);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        match window = new match();
    }
}
