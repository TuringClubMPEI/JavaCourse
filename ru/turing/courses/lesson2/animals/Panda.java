package ru.turing.courses.lesson2.animals;

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
}
