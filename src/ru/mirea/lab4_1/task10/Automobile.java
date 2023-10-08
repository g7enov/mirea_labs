package ru.mirea.lab4_1.task10;

public class Automobile extends Vehicle{
    public Automobile(){
        this.capacity = 5;
    }
    @Override
    public double getPrice(double distance) {
        return capacity * distance * 2;
    }
}
