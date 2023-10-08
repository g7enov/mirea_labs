package ru.mirea.lab6.task6_9;

public class Magazine implements Printable{
    String name;
    String release_month;

    public Magazine(String name, String release_month) {
        this.name = name;
        this.release_month = release_month;
    }

    @Override
    public void print() {
        System.out.println("Журнал " + name + ". Месяц выпуска - " + release_month);
    }

    // 7 работа, 7 пункт

    public String getName() {
        return name;
    }

    public static void printMagazines(Printable[] printable){
        for(int i = 0; i < printable.length; i++){
            if(printable[i] instanceof Magazine){
                System.out.println(((Magazine) printable[i]).getName());
            }
        }
    }
}
