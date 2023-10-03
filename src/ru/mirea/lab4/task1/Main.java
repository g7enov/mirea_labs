package ru.mirea.lab4.task1;

public class Main {
    public static void main(String[] args){
        seasons favSeason = seasons.valueOf("SPRING");
        seasons.print_season(favSeason);
        System.out.printf("%s: средняя температура = %d\n",favSeason.getDescription(), favSeason.getAvgTemp());

        for(seasons season : seasons.values()){
            System.out.printf(season.toString() + " - %s: средняя температура = %d\n",season.getDescription(), season.getAvgTemp());
        }
    }

}
