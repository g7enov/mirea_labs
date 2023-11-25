package ru.mirea.lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SHAPES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(new GridLayout(5, 4));
        JPanel[] panels = new JPanel[20];

        Random rand = new Random();


        for(int i = 0; i < panels.length; i++){
            panels[i] = new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    if(rand.nextBoolean()){
                        Shape oval = new Oval(rand.nextInt(100), rand.nextInt(100), rand.nextInt(20,70), rand.nextInt(20,70));
                        oval.paint(g);
                    }else{
                        Shape rectangle = new Rectangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(20,70), rand.nextInt(20,70));
                        rectangle.paint(g);
                    }
                }
            };
            frame.add(panels[i]);
        }
        frame.setVisible(true);
    }
}
