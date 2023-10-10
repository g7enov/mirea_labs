package ru.mirea.lab8;
import java.util.Scanner;
public class task10 {
    public static int NumReverse(int n, int ans){
        if(n / 10 == 0){
            ans = ans * 10 + n;
            return ans;
        }else{
            ans = ans * 10 + n%10;
            return NumReverse(n/10, ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(NumReverse(sc.nextInt(), 0));
    }
}
