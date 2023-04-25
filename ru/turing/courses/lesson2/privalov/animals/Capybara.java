package ru.turing.courses.lesson2.privalov.animals;

import java.util.Objects;

public class Capybara extends Animal {
    private String countryOfOrigin;
    private boolean domesticated;

    public Capybara(int lengthInCm, GenderEnum gender, String countryOfOrigin, boolean domesticated) {
        super(lengthInCm, gender);
        this.countryOfOrigin = countryOfOrigin;
        this.domesticated = domesticated;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    @Override
    public void giveBirth() {
        System.out.println("От капибары родилось несколько капибарят!");
    }

    @Override
    public void makeSound() {
        System.out.println("*звуки крутости*");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capybara capybara = (Capybara) o;
        return domesticated == capybara.domesticated && Objects.equals(countryOfOrigin, capybara.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfOrigin, domesticated);
    }
}
