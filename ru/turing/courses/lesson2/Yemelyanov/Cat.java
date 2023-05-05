package ru.turing.courses.lesson2.Yemelyanov;

import java.util.Objects;

public class Cat extends Animal {

    private String animalClass;

    @Override
    public void makeSound() {
        System.out.println("Мяуууу");
    }

    public Cat(String animalClass, int penisLength, String color) {
        super(penisLength, color);
        this.animalClass = animalClass;

    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

   @Override
    public void classify() {
        System.out.println("Является " + getAnimalClass());
    }

    @Override
    public void printPenisLength() {
        System.out.println("Длина детородного органа кота (прости господи) составляет " + getPenisLength() + " сантиметров");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return penisLength == cat.penisLength &&
                color.equals(cat.color) &&
                Objects.equals(animalClass, cat.animalClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalClass, penisLength, color);
    }
}
