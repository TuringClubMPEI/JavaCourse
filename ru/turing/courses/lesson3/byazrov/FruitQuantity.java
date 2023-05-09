package ru.turing.courses.lesson3.byazrov;

import java.util.Arrays;
import java.util.HashSet;

public abstract class FruitQuantity {

    protected Integer amountOfFruits;
    protected String nameOfQuantity;
    protected HashSet<String> namesOfFruits;
    protected boolean isFruitsFresh;
    protected Integer amountOfRottenFruits;

    public FruitQuantity(Integer amountOfFruits, String nameOfFruits, boolean isFruitsFresh, Integer amountOfRottenFruits, String nameOfQuantity) {
        this.nameOfQuantity = nameOfQuantity;
        this.amountOfFruits = amountOfFruits;
        this.namesOfFruits = new HashSet<>(Arrays.asList(nameOfFruits.split(",")));
        this.isFruitsFresh = isFruitsFresh;
        if (!isFruitsFresh){
            this.amountOfRottenFruits = amountOfRottenFruits;
        }
    }

    public FruitQuantity(Integer amountOfFruits, String nameOfFruits, boolean isFruitsFresh, String nameOfQuantity) {
        this.nameOfQuantity = nameOfQuantity;
        this.amountOfFruits = amountOfFruits;
        this.namesOfFruits = new HashSet<>(Arrays.asList(nameOfFruits.split(",")));
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

    public HashSet<String> getNamesOfFruits() {
        return namesOfFruits;
    }

    public void setNamesOfFruits(HashSet<String> namesOfFruits) {
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
