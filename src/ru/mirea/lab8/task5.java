package ru.mirea.lab8;
import java.util.Scanner;
public class task5 {
    public static int digitSum(int n){
        if(n%10 == 0){
            return n;
        }else{
            return n%10 + digitSum(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(digitSum(sc.nextInt()));
    }
}
