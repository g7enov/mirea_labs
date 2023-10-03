package ru.mirea.lab4.task4;

public enum Monitor  {
    MSI(27, "VA"),
    Samsung(32, "TN"),
    AOC(24, "IPS")
    ;
    private final int size;
    private final String matrix;

    Monitor(int size, String matrix) {
        this.size = size;
        this.matrix = matrix;
    }

    public int getSize() {
        return size;
    }

    public String getMatrix() {
        return matrix;
    }
}
