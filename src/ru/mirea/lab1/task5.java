package ru.mirea.lab1;
import java.math.BigInteger;
import java.util.Scanner;

public class task5  {
    public static BigInteger factorial(int x){
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i<=x; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int f = sc.nextInt();
        System.out.println("Факториал числа " + f + " = " + factorial(f));
    }
}