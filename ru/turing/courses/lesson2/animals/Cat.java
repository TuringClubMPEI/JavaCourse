package ru.turing.courses.lesson2.animals;
import java.util.Objects;

public class Cat extends Animal {
    private String breed;
    private int countOfLives;

    /**
     * Конструктор класса Cat.
     *
     * @param breed порода данного кота.
     * @param countOfLives кол-во оставшихся жизней данного кота.
     */
    public Cat(String breed, int countOfLives) {
        super("Кошачий корм", "Дом, в который кота принёс кожаный мешок");
        this.breed = breed;
        this.countOfLives = countOfLives;
    }

    /**
     * Абстрактный метод суперкласса, который необходимо переопределить.
     */
    @Override
    public void makeSounds() { //определяем абстрактный метод суперкласса
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return countOfLives == cat.countOfLives && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, countOfLives);
    }
}
