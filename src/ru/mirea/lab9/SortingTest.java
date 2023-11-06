package ru.mirea.lab9;

public class SortingTest {
    public static void main(String[] args) {
        Student[] students_list = new Student[]{new Student(135, 28), new Student(199, 53), new Student(144, 17),
                                                new Student(398, 30), new Student(240, 89), new Student(100, 62),
                                                new Student(211, 33), new Student(118, 50)};

        Sorting sorting = new Sorting();
        sorting.setStudents(students_list);
        sorting.InsertionSortId();
        System.out.println(sorting.toString());

        SortingStudentsByGPA GPA_sorting = new SortingStudentsByGPA();
        GPA_sorting.quickSortGPA(students_list);
        System.out.println(sorting.toString());
    }
}
