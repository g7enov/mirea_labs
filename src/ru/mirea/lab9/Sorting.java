package ru.mirea.lab9;

public class Sorting {
    private Student[] Students;
    public Sorting(){}
    public void setStudents(Student[] students){
        this.Students = students;
    }
    public Sorting(Student[] students){
        this.Students = students;
    }
    public void InsertionSortId(){
        for(int i = 1; i < Students.length; i++){
            Student current = Students[i];
            int j = i;
            while(j > 0 && Students[j-1].compareTo(current) > 0){
                Students[j] = Students[j-1];
                j--;
            }
            Students[j] = current;
        }
    }
    public String toString(){
        String output = "";
        for (Student student : Students) {
            output += "{" + student.getStudent_id() + ", " + student.getGPA() + "} ";
        }
        return output;
    }
}
