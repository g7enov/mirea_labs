package ru.mirea.lab13;

public class task1 {
    public void method(String str){
        System.out.println("Пункт 2: " + str.charAt(str.length()-1));
        System.out.println("Пункт 3: " + str.endsWith("!!!"));
        System.out.println("Пункт 4: " + str.startsWith("I like"));
        System.out.println("Пункт 5: " + str.contains("Java"));
        System.out.println("Пункт 6: " + str.indexOf("Java"));
        System.out.println("Пункт 7: " + str.replace('a','o'));
        System.out.println("Пункт 8: " + str.toUpperCase());
        System.out.println("Пункт 9: " + str.toLowerCase());
        System.out.println("Пункт 10: " + str.substring(0, str.indexOf("Java")) + str.substring(str.lastIndexOf("!!!")));
    }
    public void method(){
        method("I like Java!!!");
    }
    public static void main(String[] args) {
        task1 t1 = new task1();
        t1.method();
    }
}
