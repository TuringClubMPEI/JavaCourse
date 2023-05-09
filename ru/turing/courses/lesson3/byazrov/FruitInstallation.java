package ru.turing.courses.lesson3.byazrov;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FruitInstallation extends FruitQuantity{

    private boolean areAllInPlace;

    public FruitInstallation(Integer amountOfFruits, Set<String> namesOfFruits, boolean isFruitsFresh, Integer amountOfRottenFruits, String nameOfQuantity, boolean areAllInPlace) {
        super(amountOfFruits, namesOfFruits, isFruitsFresh, amountOfRottenFruits, nameOfQuantity);
        this.areAllInPlace = areAllInPlace;
    }

    public FruitInstallation(Integer amountOfFruits, Set<String> namesOfFruits, boolean isFruitsFresh, String nameOfQuantity, boolean areAllInPlace) {
        super(amountOfFruits, namesOfFruits, isFruitsFresh, nameOfQuantity);
        this.areAllInPlace = areAllInPlace;
    }
}
