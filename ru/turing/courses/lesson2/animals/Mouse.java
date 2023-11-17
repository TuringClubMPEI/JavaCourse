package ru.turing.courses.lesson2.animals;

public class Mouse extends Animal {
    private String favoriteTypeOfCheese;
    private String hoursOfSleep;

    public String getFavoriteTypeOfCheese() {
        return favoriteTypeOfCheese;
    }

    public void setFavoriteTypeOfCheese(String favoriteTypeOfCheese) {
        this.favoriteTypeOfCheese = favoriteTypeOfCheese;
    }

    public String getHoursOfSleep() {
        return hoursOfSleep;
    }

    public void setHoursOfSleep(String hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }

    public Mouse(String klichka, String color, String breed, int age, int numberOfPaws, String favoriteTypeOfCheese, String hoursOfSleep) {
        super(klichka, color, breed, age, numberOfPaws);
        this.favoriteTypeOfCheese = favoriteTypeOfCheese;
        this.hoursOfSleep = hoursOfSleep;
    }

    public void eat(String favoriteTypeOfCheese) {
        System.out.println("Мышич поел своего любимого сыра " + favoriteTypeOfCheese);
    }

    public void sleep(String hoursOfsleep) {
        System.out.println("Мышич подремал " + hoursOfsleep + " минут");
    }

    public void krodetsya() {
        System.out.println("Мыш......(кродеться)...");
    }
}
