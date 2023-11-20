package ru.mirea.lab10;

import java.util.Comparator;

public class Student{
    private String Name;
    private String Lastname;
    private String Specialty;
    private int Year;
    private int Group;

    public Student(String name, String lastname, String specialty, int year, int group) {
        Name = name;
        Lastname = lastname;
        Specialty = specialty;
        Year = year;
        Group = group;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Lastname;
    }

    public void setSurname(String surname) {
        Lastname = surname;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Specialty='" + Specialty + '\'' +
                ", Year=" + Year + ", Group='" + Group + '\'' + '}';
    }
}
