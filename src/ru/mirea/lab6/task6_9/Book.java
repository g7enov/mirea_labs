package ru.mirea.lab6.task6_9;

public class Book implements Printable{
    String name;
    int pages_num;
    public Book(String name, int pages_num){
        this.name = name;
        this.pages_num = pages_num;
    }

    @Override
    public void print(){
        System.out.println("Книга " + name + ". Количество страниц - " + pages_num);
    }
}
