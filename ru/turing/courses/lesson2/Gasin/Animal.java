package ru.turing.courses.lesson2.Gasin;

/**
 * Животное
 */
public abstract class Animal {
    /**
     * Наименование вида
     */
    protected String speciesName;
    /**
     * Количество полностью прожитых лет
     */
    protected int age;
    /**
     * Пол
     */
    protected boolean sex;

    public Animal(String speciesName, int age, boolean sex) {
        this.speciesName = speciesName;
        this.age = age;
        this.sex = sex;
    }

    public abstract String getSound();

    public abstract void sleep();

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
