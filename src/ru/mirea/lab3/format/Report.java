package ru.mirea.lab3.format;
import java.util.Formatter;

public class Report {
    public static Formatter generateReport(Employee[] workers){
        Formatter fmt = new Formatter();
        for(int i = 0; i < workers.length; i++){
            fmt.format(" %-20s %.2f\n", workers[i].getFullname(), workers[i].getSalary());
        }
        return fmt;
    }
    public static void main(String[] args){
        Employee[] workers = new Employee[]{new Employee("Artur Morgan", 1000.089), new Employee("John Marston", 855.456),
                new Employee("Bill Williamson", 1234.5225)};
        System.out.println("Зарплата сотрудников\n" + generateReport(workers));
    }
}
