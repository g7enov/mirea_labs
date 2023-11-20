package ru.mirea.lab10;

import java.util.Comparator;

public class MergeSort implements Comparator<Student> {
    public MergeSort(){}
    public Student[] Merge(Student[] group_1, Student[] group_2){
        Student[] result = new Student[group_1.length + group_2.length];
        int i = 0, j = 0, k = 0;
        while (i < group_1.length && j < group_2.length){
            if(compare(group_1[i], group_2[j]) < 0){
                result[k] = group_1[i];
                i++;
            }else{
                result[k] = group_2[j];
                j++;
            }
            k++;
        }
        while(i < group_1.length){
            result[k] = group_1[i];
            i++;
            k++;
        }
        while(j < group_2.length){
            result[k] = group_2[j];
            j++;
            k++;
        }
        return result;
    }
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
