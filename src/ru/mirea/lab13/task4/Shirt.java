package ru.mirea.lab13.task4;

public class Shirt {
    private String article;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirts) {
        String[] properties = shirts.split(",");
        article = properties[0];
        name = properties[1];
        color = properties[2];
        size = properties[3];
    }
    public String toString(){
        return "Артикль - " + article + "\nНаименование - " + name + "\nЦвет - " + color + "\nРазмер - " + size;
    }
}
