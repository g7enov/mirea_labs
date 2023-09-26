package ru.mirea.lab3;
import java.util.concurrent.ThreadLocalRandom;
import static java.lang.System.exit;
public class random3 {
    public static void main(String[] args){
        int[] rand_array = new int[4];
        for(int i = 0; i < rand_array.length; i++){
            rand_array[i] = ThreadLocalRandom.current().nextInt(10, 100);
            System.out.printf("%d\t", rand_array[i]);
        }
        for(int i = 0; i < rand_array.length - 1; i++){
            if(rand_array[i] >= rand_array[i+1]){
                System.out.println("\nМассив не является строго возрастающей последовательностью");
                exit(0);
            }
        }
        System.out.println("\nМассив является строго возрастающей последовательностью");
    }
}
