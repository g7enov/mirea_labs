package ru.mirea.lab5;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class image {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("image");
        frame.setSize(680,680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File file = new File(args[0]);
        BufferedImage img = read(file);
        ImageIcon img_Icon = new ImageIcon(img);
        JLabel label = new JLabel();
        label.setIcon(img_Icon);
        frame.add(label);

        frame.setVisible(true);
    }
}
