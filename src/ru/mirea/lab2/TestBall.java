package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args){
        Ball ball_1 = new Ball(4, 3);
        System.out.println(ball_1.toString());
        ball_1.setX(5.6);
        ball_1.setY(7.8);
        System.out.println(ball_1.toString());

        Ball ball_2 = new Ball();
        ball_2.setXY(9.999, 10.0);
        System.out.println("x = " + ball_2.getX() + ", y = " + ball_2.getY());
        ball_2.move(123, 3.45);
    }
}