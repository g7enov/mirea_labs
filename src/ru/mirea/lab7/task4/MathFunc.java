package ru.mirea.lab7.task4;
import java.math.*;
public class MathFunc implements MathCalculable{
    @Override
    public double pow(double num, int deg) {
        double x = 1;
        if(deg > 0){
            for(int i = 0; i < deg; i++)
                x *= num;
        }else {
            for (int i = 0; i > deg; i--)
                x /= num;
        }
        return x;
    }
    public double circle_area(double radius){
        return PI * pow(radius, 2);
    }

    @Override
    public double complex_num_abs(int a, int b) {
        return Math.sqrt(pow(a, 2) + pow(b, 2));
    }
}
