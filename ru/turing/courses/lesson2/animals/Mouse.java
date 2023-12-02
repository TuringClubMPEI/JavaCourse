package ru.turing.courses.lesson2.animals;

public class Mouse extends Animal {
    private String favoriteTypeOfCheese;
    private String hoursOfSleep;
    private int intHoursOfsleep;

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

    public int getIntHoursOfsleep() {
        return intHoursOfsleep;
    }

    public void setIntHoursOfsleep(int intHoursOfsleep) {
        this.intHoursOfsleep = intHoursOfsleep;
    }

    public Mouse(String name, String color, String breed, int age, int numberOfPaws, String favoriteTypeOfCheese, String hoursOfSleep, int intHoursOfsleep) {
        super(name, color, breed, age, numberOfPaws);
        this.favoriteTypeOfCheese = favoriteTypeOfCheese;
        this.hoursOfSleep = hoursOfSleep;
        this.intHoursOfsleep = intHoursOfsleep;
    }

    @Override
    public void eat(String favoriteTypeOfCheese) {
        System.out.println("Мышич поел своего любимого сыра " + favoriteTypeOfCheese);
    }

    @Override
    public void sleep(int intHoursOfsleep) {
        System.out.println("Мышич подремал " + intHoursOfsleep + " минут");
    }

    public void krodetsya() {
        System.out.println("Мыш......(кродеться)...");
    }
}
