package ru.mirea.lab12;

import java.awt.*;

public class Oval extends Shape{
    private int width;
    private int height;
    public Oval(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
