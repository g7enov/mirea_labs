package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        Calendar cur_date = Calendar.getInstance();

        System.out.println("Текущая дата: " + sdf.format(cur_date.getTime()));
        System.out.println("Введите: год/месяц/день");

         Calendar user_date = Calendar.getInstance();
        user_date.set(Calendar.YEAR, sc.nextInt());
        user_date.set(Calendar.MONTH, sc.nextInt()-1);
        user_date.set(Calendar.DAY_OF_MONTH, sc.nextInt());

        System.out.println("Пользовательская дата: " + sdf.format(user_date.getTime()));
        if(cur_date.after(user_date)){
            System.out.println("Пользовательская дата раньше");
        }else {
            System.out.println("Текущая дата раньше");
        }
    }
}
