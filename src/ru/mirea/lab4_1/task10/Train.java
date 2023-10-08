package ru.mirea.lab4_1.task10;

public class Train extends Vehicle {
    private int wagons_num;
    public Train(int wagons_num){
        this.capacity = 54;
        this.wagons_num = wagons_num;
    }

    @Override
    public double getPrice(double distance) {
        return capacity * wagons_num * 2500 + distance * 3000;
    }
}
