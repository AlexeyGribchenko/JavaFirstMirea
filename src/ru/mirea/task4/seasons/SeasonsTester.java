package ru.mirea.task4.seasons;

public class SeasonsTester {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        Seasons.printSeason(season);
        System.out.println("Temperature: " +
                season.getAvgTemperature() +
                " Description: " +
                season.getDescription() +
                "\n");

        Seasons.printAllSeasons();
    }
}
