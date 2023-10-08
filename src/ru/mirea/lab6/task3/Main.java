package ru.mirea.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Nameable Earth = new Planet1();
        System.out.println(Earth.get_name());

        Nameable Mars = new Planet2();
        System.out.println(Mars.get_name());
    }
}
