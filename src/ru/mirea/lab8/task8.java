package ru.mirea.lab8;
import java.util.Scanner;
public class task8 {
    public static String palindrome(String word){
         if(word.length() > 1){
             char first = word.charAt(0);
             char last = word.charAt(word.length()-1);
             if(first == last){
                 word = word.substring(1, word.length()-1);
                 return palindrome(word);
             }else{
                 return "NO";
             }
         }else {
             return "YES";
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(palindrome(sc.next()));
    }
}
