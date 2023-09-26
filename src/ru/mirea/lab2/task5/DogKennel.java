package ru.mirea.lab2.task5;
import ru.mirea.lab2.task5.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DogKennel {
    private static List<Dog> kennel = new ArrayList<Dog>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String new_name;
        int new_age;

        System.out.println("Введите 'stop', чтобы остановить ввод");
        while(sc != null){
           System.out.println("Введите имя");
           new_name = sc.next();
           if(Objects.equals(new_name, "stop")) {
               break;
           }
           System.out.println("Введите возраст");
           new_age = sc.nextInt();
           Dog new_dog = new Dog(new_name, new_age);
           kennel.add(new_dog);
        }

        for(int i = 0; i < kennel.size(); i++) {
            System.out.println((i+1) + ") " + kennel.get(i).toString());
        }
    }
}