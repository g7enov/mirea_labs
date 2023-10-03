package ru.mirea.lab4.task1;

public enum seasons {
    WINTER(-6),
    SPRING(6),
    SUMMER(17),
    AUTUMN(5)
    ;
    private final int AvgTemp;
    private seasons(int AvgTemp){
        this.AvgTemp = AvgTemp;
    }

    public int getAvgTemp() {
        return AvgTemp;
    }

    public static void print_season(seasons season){
        switch (season){
            case WINTER : System.out.println("Я люблю зиму");   break;
            case SPRING : System.out.println("Я люблю весну");  break;
            case SUMMER : System.out.println("Я люблю лето");   break;
            case AUTUMN : System.out.println("Я люблю осень");  break;
        }
    }

    public String getDescription(){
        if(this == SUMMER)
            return "Теплое время года";
        return "Холодное время года";
    }
}
