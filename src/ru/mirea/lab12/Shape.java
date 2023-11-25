package ru.mirea.lab12;
import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected Color color;
    protected int x, y;
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
        Random rand = new Random();
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    public abstract void paint(Graphics g);
}
