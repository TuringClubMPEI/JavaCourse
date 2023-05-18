package ru.turing.courses.lesson2.privalov.animals;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Cat extends Animal {
    private String furColor;
    private String ownerName;

    public Cat(int lengthInCm, GenderEnum gender, String furColor, String ownerName) {
        super(lengthInCm, gender);
        this.furColor = furColor;
        this.ownerName = ownerName;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void giveBirth() {
        if (this.getGender() == GenderEnum.MALE) {
            System.out.println("От кота родилось " + ThreadLocalRandom.current().nextInt(1, 5 + 1) + " котят.");
        } else if (this.getGender() == GenderEnum.FEMALE) {
            System.out.println("Кошка родила " + ThreadLocalRandom.current().nextInt(1, 5 + 1) + " котят.");
        } else {
            System.out.println("От этого бесполого представителя кошачьих родилось " + ThreadLocalRandom.current().nextInt(1, 5 + 1) + " котят.");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(furColor, cat.furColor) && Objects.equals(ownerName, cat.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(furColor, ownerName);
    }
}
