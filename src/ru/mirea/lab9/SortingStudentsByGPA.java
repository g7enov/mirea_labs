package ru.mirea.lab9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGPA(), o2.getGPA());
    }
    public void quickSortGPA(Student[] students, int left, int right){
        int l_index = left;
        int r_index = right;
        Student pivot = students[(r_index + l_index) / 2];
        while (l_index <= r_index){
            while(compare(students[l_index], pivot) > 0){
                l_index++;
            }
            while (compare(students[r_index], pivot) < 0){
                r_index--;
            }
            if(l_index <= r_index){
                Student buf = students[l_index];
                students[l_index] = students[r_index];
                students[r_index] = buf;
                l_index++;
                r_index--;
            }
        }
        if(l_index < right){
            quickSortGPA(students, l_index, right);
        }
        if(left < r_index){
            quickSortGPA(students, left, r_index);
        }
    }
    public void quickSortGPA(Student[] students){
      this.quickSortGPA(students, 0, students.length - 1);
    }
}
