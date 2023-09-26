package ru.mirea.lab3;
import java.lang.Double;
public class task1 {
    public  static void main(String[] args){
        //1)
        Double doub1 = Double.valueOf(0.529);
        Double doub2 = Double.valueOf(3.14);
        System.out.println(doub2);
        //2)
        String str = "5.55";
        Double doub3 = Double.parseDouble(str);
        //3)
        byte x1 = doub1.byteValue();
        short x2 = doub1.shortValue();
        int x3 = doub1.intValue();
        long x4 = doub1.longValue();
        float x5 = doub1.floatValue();
        double x6 = doub1.doubleValue();
        //4)
        System.out.println(doub2);
        //5)
        String d = Double.toString(3.14);
    }
}
