package ru.turing.courses.lesson5.privalov;

import java.util.Objects;

/**
 * Класс животного
 */
public class Animal implements Comparable<Animal> {
    /**
     * Идентификатор
     */
    public long id;
    /**
     * Имя животного
     */
    public String name;
    /**
     * Вес животного в килограммах
     */
    public int weightInKg;

    public Animal(long id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weightInKg = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && weightInKg == animal.weightInKg && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weightInKg);
    }

    /**
     * Метод сравнения объектов класса Animal
     * @param o the object to be compared.
     * @return 1, если хотя бы один параметр того, что сравнивается, больше того, с чем сравнивается.
     * 0 в случае равенства
     */
    @Override
    public int compareTo(Animal o) {
        if (this.name.length() > o.name.length()) {
            return Integer.compare(this.name.length(), o.name.length());
        }

        if (this.id > o.id) {
            return Long.compare(this.id,o.id);
        }

        if (this.weightInKg > o.weightInKg) {
            return Integer.compare(this.weightInKg, o.weightInKg);
        }
        return 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weightInKg=" + weightInKg +
                '}';
    }
}


