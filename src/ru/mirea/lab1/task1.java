package ru.mirea.lab1;

public class task1 {
    public static void main(String[] args){
        int[] array = new int[] {0, 1, 2 ,3, 4, 5, 6, 7, 8, 9};
        double arr_sum = 0;
        for(int i = 0; i < array.length; i++)
            arr_sum += array[i];
        double average = arr_sum / array.length;
        System.out.println("сумма = " + arr_sum + "\nсреднее арифметическое = " + average);
    }
}