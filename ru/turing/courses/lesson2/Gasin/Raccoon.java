package ru.turing.courses.lesson2.Gasin;

import java.util.Objects;

public class Raccoon extends Animal {
    private String originContinent;
    private boolean isHungry;
    public Raccoon(int age, boolean sex, String originContinent, boolean isHungry) {
        super("Енот", age, sex);
        this.originContinent = originContinent;
        this.isHungry = isHungry;
    }

    @Override
    public String getSound() {
        return "окей гугл как говорят еноты";
    }

    @Override
    public void sleep() {
        if (isHungry) {
            System.out.println("Пойдем залезем в парочку мусорок");
        } else {
            System.out.println("Спать. Режим");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raccoon raccoon = (Raccoon) o;
        return isHungry == raccoon.isHungry
                && originContinent.equals(raccoon.originContinent)
                && sex == raccoon.sex
                && age == raccoon.age
                && Objects.equals(speciesName, raccoon.speciesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originContinent, isHungry, age, sex, speciesName);
    }
}
