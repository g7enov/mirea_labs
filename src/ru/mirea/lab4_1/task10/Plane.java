package ru.mirea.lab4_1.task10;

public class Plane extends Vehicle{
    public Plane(){
        this.capacity = 525;
    }

    @Override
    public double getPrice(double distance) {
        return capacity * 10000 + distance * 25000;
    }
}
