package ru.mirea.lab11.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY HH:mm:ss");
    private String Surname;
    private Date Start_time;
    private Date End_time;
    public Task(String surname, long start_time){
        this.Surname = surname;
        this.Start_time = new Date();
        this.Start_time.setTime(start_time);
    }
    public void Submit_task(){
        this.End_time = new Date();
    }
    public String toString(){
        if(End_time == null){
            return "Задача{Исполнитель: " + Surname + ". Время получения: " + sdf.format(Start_time) + ". Задача активна}";
        }else {
            return "Задача{Исполнитель: " + Surname + ". Время получения: " + sdf.format(Start_time) + ". Время сдачи: " + sdf.format(End_time) + "}";
        }
    }
}
