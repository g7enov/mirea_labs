package ru.mirea.lab4_1.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Время и стоимость перевозки автомобилем за 100 км");
        Vehicle automobile = new Automobile();
        System.out.println(automobile.getTime( 90, 100) + "ч " + automobile.getPrice(100) + 'р');

        System.out.println("Время и стоимость перевозки самолетом за 100 км");
        Vehicle plane = new Plane();
        System.out.println(plane.getTime( 500, 100) + "ч " + plane.getPrice(100) + 'р');

        System.out.println("Время и стоимость перевозки поездом за 100 км");
        Vehicle train = new Train(11);
        System.out.println(train.getTime( 60, 100) + "ч " + train.getPrice(100) + 'р');
    }
}
