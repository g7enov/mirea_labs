package ru.mirea.lab4.task4;

public enum Processor {
    AMD(3900,6),
    Intel(3300,4),
    Baikal(1500, 8)
    ;
    private final int speed;
    private final int cores_num;

    Processor(int speed, int cores_num) {
        this.speed = speed;
        this.cores_num = cores_num;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCores_num() {
        return cores_num;
    }
}
