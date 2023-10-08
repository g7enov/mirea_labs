package ru.mirea.lab6.task1;

public class MovableCircle extends MovablePoint{
    MovablePoint center;
    int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }
}
