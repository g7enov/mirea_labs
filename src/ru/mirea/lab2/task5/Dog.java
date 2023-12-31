package ru.mirea.lab2.task5;

public class Dog {
    private String name = "";
    private int age = 0;

    public Dog(String name, int age){
        this.name = name;
        if(age > this.age)
            this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumAge(){
        return this.age * 7;
    }

    public String toString(){
        return "Dog{" + "name='" + name + '\'' +
                ", age='" + age + '}';
    }
}
