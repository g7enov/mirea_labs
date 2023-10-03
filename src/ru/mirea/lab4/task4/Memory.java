package ru.mirea.lab4.task4;

public enum Memory {
    HyperX(16, 2666),
    Kingston(8, 3200),
    Patriot(32, 3000)
    ;
    private final int capacity;
    private final int speed;

    Memory(int capacity, int speed){
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }
}
