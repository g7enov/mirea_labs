package ru.mirea.lab9;

public class Student implements Comparable<Student>{
    private int Student_id;
    private int GPA;
    public Student(int student_id, int gpa){
        this.Student_id = student_id;
        this.GPA = gpa;
    }

    public int getStudent_id() {
        return this.Student_id;
    }
    public int getGPA(){
        return this.GPA;
    }

    @Override
    public int compareTo(Student o) {
        return this.Student_id - o.Student_id;
    }
}
