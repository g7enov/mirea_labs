package ru.mirea.lab4_1.task2;

public class Phone {
   private String number;
   private String model;
   private double weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }
    public String getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит {"+name+'}');
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит {"+name+"}:\n" + number);
    }
    public void sendMessage(String[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
