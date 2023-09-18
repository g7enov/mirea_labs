package ru.mirea.lab1;
import java.util.Scanner;

public class task5  {
    public static int factorial(int x){
        int result = 1;
        for(int i = 1; i<=x; i++)
            result *= i;
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int f = sc.nextInt();
        System.out.println("Факториал числа " + f + " = " + factorial(f));
    }
}