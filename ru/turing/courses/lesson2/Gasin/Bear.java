package ru.turing.courses.lesson2.Gasin;

import java.util.Objects;

/**
 * Медведь
 */
public class Bear extends Animal {
    /**
     * Основной цвет шерсти
     */
    private String color;
    /**
     * Спит ли медведь в данный момент
     */
    private boolean isSleeping;

    public Bear(int age, boolean sex, String color, boolean isSleeping) {
        super("Медведь", age, sex);
        this.color = color;
        this.isSleeping = isSleeping;
    }

    @Override
    public String getSound() {
        return isSleeping ? "Хррр" : "*что-то на медвежьем*";
    }

    @Override
    public void sleep() {
        if (isSleeping) {
            System.out.println("Итак спим");
        } else {
            System.out.println("Спать. Режим");
            isSleeping = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bear bear = (Bear) o;
        return isSleeping == bear.isSleeping
                && color.equals(bear.color)
                && sex == bear.sex
                && age == bear.age
                && Objects.equals(speciesName, bear.speciesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isSleeping, speciesName, age, sex);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}
