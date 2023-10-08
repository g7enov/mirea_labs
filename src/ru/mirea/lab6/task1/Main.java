package ru.mirea.lab6.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Movable point");
        Movable point1 = new MovablePoint(10, -25, 5, 15);
        System.out.println(point1.toString());
        point1.moveUp();
        point1.moveRight();
        System.out.println(point1.toString());

        System.out.println("Movable circle");
        Movable circle1 = new MovableCircle(100, 50, 50, 25, 40);
        System.out.println(circle1.toString());
        circle1.moveDown();
        circle1.moveLeft();
        System.out.println(circle1.toString());
    }
}
