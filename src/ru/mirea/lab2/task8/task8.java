package ru.mirea.lab2.task8;

public class task8 {
    public static void main(String[] args){
        String[] x = new String[]{"Напишите", "программу", "которая", "меняет", "местами", "элементы"};
        String buf;
        for(int i = 0; i < x.length/2; i++){
            buf = x[x.length - i - 1];
            x[x.length - i - 1] = x[i];
            x[i] = buf;
        }
        for(int i = 0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
}
