package ru.mirea.lab7.task4;

public class Main {
    public static void main(String[] args) {
        MathFunc MF = new MathFunc();
        System.out.println("Возведение в степень");
        System.out.println(MF.pow(2, 10));

        System.out.println("Площадь круга");
        System.out.println(MF.circle_area(3.5));

        System.out.println("Модуль комплексного числа");
        System.out.println(MF.complex_num_abs(3, -4));
    }
}
