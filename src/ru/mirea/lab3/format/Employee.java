package ru.mirea.lab3.format;

import static ru.mirea.lab3.format.Report.generateReport;

public class Employee {
    //1)
    private String fullname;
    private double salary;

    public String getFullname() {
        return fullname;
    }
    public double getSalary() {
        return salary;
    }
    public Employee(String fullname, double salary){
        this.fullname = fullname;
        this.salary = salary;
    }
}
