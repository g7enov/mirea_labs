package ru.mirea.lab11.task1;

public class Test {
    public static void main(String[] args) {
        Task task = new Task("ivan",1699188119);
        System.out.println(task.toString());
        task.Submit_task();
        System.out.println(task.toString());
    }
}
