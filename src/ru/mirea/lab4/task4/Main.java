package ru.mirea.lab4.task4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите процессор: Intel/AMD/Baikal");
        Processor processor = Processor.valueOf(sc.next());
        System.out.println("Выберите память: HyperX/Kingston/Patriot");
        Memory memory = Memory.valueOf(sc.next());
        System.out.println("Выберите монитор: MSI/Samsung/AOC");
        Monitor monitor = Monitor.valueOf(sc.next());
        Computer computer = new Computer(processor, memory, monitor);
        System.out.println(computer.Print_Computer_info());
    }
}
