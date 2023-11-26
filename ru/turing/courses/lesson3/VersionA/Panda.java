package ru.turing.courses.lesson3.VersionA;

import java.util.Objects;

public class Panda extends Animal{
    //регион Китая
    private String regionOfChina;
    //длина клюва
    private int  lengthCanine;

    public Panda(String name, boolean isHerbivore, double weight, String regionOfChina, int  lengthCanine) {
        super(name, isHerbivore, weight);
        this.regionOfChina = regionOfChina;
        this.lengthCanine = lengthCanine;
    }

    @Override
    public void printFood() {
        System.out.println("бамбук, луковицы (например, ириса и шафрана), травы");
    }

    @Override
    public void printLifeTime() {
        System.out.println("примерно 26 лет");
    }

    @Override
    public void printMakeSound() {
        System.out.println("рычит или чавкает");
    }

    public String getRegionOfChina() {
        return regionOfChina;
    }

    public void setRegionOfChina(String regionOfChina) {
        this.regionOfChina = regionOfChina;
    }

    public int getLengthCanine() {
        return lengthCanine;
    }

    public void setLengthCanine(int lengthCanine) {
        this.lengthCanine = lengthCanine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panda panda = (Panda) o;
        return lengthCanine == panda.lengthCanine && Objects.equals(regionOfChina, panda.regionOfChina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionOfChina, lengthCanine);
    }

    @Override
    public void call(Guest guest) {
        guest.attend(this);
    }
}
