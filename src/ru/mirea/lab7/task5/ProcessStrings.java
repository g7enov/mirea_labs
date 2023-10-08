package ru.mirea.lab7.task5;

public class ProcessStrings implements ProcessStringsInterface{
    @Override
    public int symCount(String string) {
        return string.length();
    }

    @Override
    public String StringProcessing(String string) {
        String new_string = "";
        String[] splitted_string = string.split("");
        for (int i = 1; i < splitted_string.length; i+=2){
            new_string += splitted_string[i];
        }
        return new_string;
    }

    @Override
    public String reverseString(String string) {
        String new_string = "";
        String[] splitted_string = string.split("");
        for (int i = splitted_string.length - 1; i >= 0; i--){
            new_string += splitted_string[i];
        }
        return new_string;
    }
}
