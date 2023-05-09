package ru.turing.courses.lesson3.byazrov;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class FruitQuantity {

    protected Integer amountOfFruits;
    protected String nameOfQuantity;
    protected Set<String> namesOfFruits;
    protected boolean isFruitsFresh;
    protected Integer amountOfRottenFruits;

    public FruitQuantity(Integer amountOfFruits, Set<String> namesOfFruits, boolean isFruitsFresh, Integer amountOfRottenFruits, String nameOfQuantity) {
        this.nameOfQuantity = nameOfQuantity;
        this.amountOfFruits = amountOfFruits;
        this.namesOfFruits = namesOfFruits;
        this.isFruitsFresh = isFruitsFresh;
        if (!isFruitsFresh){
            this.amountOfRottenFruits = amountOfRottenFruits;
        }
    }

    public FruitQuantity(Integer amountOfFruits, Set<String> namesOfFruits, boolean isFruitsFresh, String nameOfQuantity) {
        this.nameOfQuantity = nameOfQuantity;
        this.amountOfFruits = amountOfFruits;
        this.namesOfFruits = namesOfFruits;
        this.isFruitsFresh = isFruitsFresh;
    }

    public Integer getAmountOfFruits() {
        return amountOfFruits;
    }

    public void setAmountOfFruits(Integer amountOfFruits) {
        this.amountOfFruits = amountOfFruits;
    }

    public String getNameOfQuantity() {
        return nameOfQuantity;
    }

    public void setNameOfQuantity(String nameOfQuantity) {
        this.nameOfQuantity = nameOfQuantity;
    }

    public Set<String> getNamesOfFruits() {
        return namesOfFruits;
    }

    public void setNamesOfFruits(Set<String> namesOfFruits) {
        this.namesOfFruits = namesOfFruits;
    }

    public boolean isFruitsFresh() {
        return isFruitsFresh;
    }

    public void setFruitsFresh(boolean fruitsFresh) {
        isFruitsFresh = fruitsFresh;
    }

    public Integer getAmountOfRottenFruits() {
        return amountOfRottenFruits;
    }

    public void setAmountOfRottenFruits(Integer amountOfRottenFruits) {
        this.amountOfRottenFruits = amountOfRottenFruits;
    }
}
