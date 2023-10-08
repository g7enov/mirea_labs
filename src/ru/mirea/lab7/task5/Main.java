package ru.mirea.lab7.task5;

public class Main {
    public static void main(String[] args) {
        ProcessStringsInterface SI = new ProcessStrings();
        System.out.println(SI.symCount("Сегодня: снег с дождем не прекратится"));
        System.out.println(SI.StringProcessing("Сегодня: снег с дождем не прекратится"));
        System.out.println(SI.reverseString("Сегодня: снег с дождем не прекратится"));
    }
}
