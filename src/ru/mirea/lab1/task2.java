package ru.mirea.lab1;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы");

        for(int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        int arr_sum = 0, arr_min = array[0], arr_max = array[0];
        int i = 0;
        while(i < size){
            arr_sum += array[i];
            if(array[i] < arr_min)
                arr_min = array[i];
            if(array[i] > arr_max)
                arr_max = array[i];
            i++;
        }
        System.out.println("сумма = " + arr_sum + "\nминимальный элемент = " + arr_min + "\nмаксимальный элемент = " + arr_max);
        //System.out.println("минимальный элемент = " + arr_min + "\nмаксимальный элемент = " + arr_max);

    }
}