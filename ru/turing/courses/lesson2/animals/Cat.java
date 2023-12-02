package ru.turing.courses.lesson2.animals;

public class Cat extends Animal {

    protected String playWithLaser;
    protected String favoriteTypeOfFeed;

    public Cat(String name, String color, String breed, int age, int numberOfPaws, String playWithLaser, String favoriteTypeOfFeed) {
        super(name, color, breed, age, numberOfPaws);
        this.playWithLaser = playWithLaser;
        this.favoriteTypeOfFeed = favoriteTypeOfFeed;
    }

    public String getPlayWithLaser() {
        return playWithLaser;
    }

    public void setPlayWithLaser(String playWithLaser) {
        this.playWithLaser = playWithLaser;
    }

    public String getFavoriteTypeOfFeed() {
        return favoriteTypeOfFeed;
    }

    public void setFavoriteTypeOfFeed(String favoriteTypeOfFeed) {
        this.favoriteTypeOfFeed = favoriteTypeOfFeed;
    }

    @Override
    public void play(String playWithLaser) {
        System.out.println("Вы поиграли с котом лазерной указкой " + playWithLaser + " минут");

    }
    @Override
    public void eat(String favoriteTypeOfFeed) {
        System.out.println("Вы покормили кота его любимым " + favoriteTypeOfFeed);
    }

    public void cheel() {
        System.out.println("Котярыч отдохнул");

    }
}
