package ru.turing.courses.lesson2.animals;

import java.util.Objects;


public abstract class Animal {
    private String foodType; //тип питания
    private String habitat; //среда обитания

    /**
     * Абстрактный метод, который необходимо переопределить в наследниках.
     */
    public abstract void makeSounds(); //этот метод нужно определить в наследниках

    /**
     * Конструктор класса
     *
     * @param foodType любимый еда этого животного
     * @param habitat  среда обитания этого животного
     */
    public Animal(String foodType, String habitat) {
        this.foodType = foodType;
        this.habitat = habitat;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(foodType, animal.foodType) && Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType, habitat);
    }
}
