package ru.turing.courses.lesson3.byazrov;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FruitInstallation extends FruitQuantity{

    private boolean areAllInPlace;

    public FruitInstallation(Integer amountOfFruits, String nameOfFruits, boolean isFruitsFresh, Integer amountOfRottenFruits, String nameOfQuantity, boolean areAllInPlace) {
        super(amountOfFruits, nameOfFruits, isFruitsFresh, amountOfRottenFruits, nameOfQuantity);
        this.areAllInPlace = areAllInPlace;
    }

    public FruitInstallation(Integer amountOfFruits, String nameOfFruits, boolean isFruitsFresh, String nameOfQuantity, boolean areAllInPlace) {
        super(amountOfFruits, nameOfFruits, isFruitsFresh, nameOfQuantity);
        this.areAllInPlace = areAllInPlace;
    }
}
