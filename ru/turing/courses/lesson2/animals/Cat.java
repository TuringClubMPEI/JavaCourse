package ru.turing.courses.lesson2.animals;

import ru.turing.courses.lesson2.animals.Animal;

public class Cat extends Animal {
    private String breed; //порода
    private int countOfLives; //кол-во отсавшихся жизней

    public Cat(String breed, int countOfLives) {
        super("Кошачий корм", "Дом, в который кота принёс кожаный мешок");//поля из класса Animal для кошек одинаковые
        this.breed = breed;
        this.countOfLives = countOfLives;
    }

    @Override
    public void makeSounds(){ //определяем абстрактный метод суперкласса
        System.out.println("Мяу-мяу!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCountOfLives() {
        return countOfLives;
    }

    public void setCountOfLives(int countOfLives) {
        this.countOfLives = countOfLives;
    }
}
