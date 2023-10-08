package ru.mirea.lab4_1.task10;

public abstract class Vehicle {
    double speed;
    int capacity;
    public double getTime(double speed, double distance){
        return distance/speed;
    }
    abstract public double getPrice(double distance);
}
