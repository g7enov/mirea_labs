package ru.mirea.lab10;

public class Main {
    public static void main(String[] args) {
        Student[] group_1 = new Student[]{  new Student("А", "Виноградов",  "мед", 2, 22),
                                            new Student("Б", "Гранатов",    "мед", 2, 22),
                                            new Student("В" , "Яблоков",    "мед", 2, 22)};

        Student[] group_2 = new Student[]{  new Student("Г", "Арбузов",     "it", 3, 10),
                                            new Student("Д", "Лимонов",     "it", 3, 10),
                                            new Student("Е", "Мандаринов",  "it", 3, 10)};


        Student[] merged_group = new MergeSort().Merge(group_1, group_2);
        for(int i = 0; i < merged_group.length; i++){
            System.out.println(merged_group[i].toString());
        }
    }
}
