package ru.turing.courses.lesson3;

public class Tulip extends Flower {

    @Override
    public String toString() {
        return "Tulip";
    }

    public Tulip(int flowerId, String colorOfFlower, int flowerPrice) {
        super(flowerId, colorOfFlower, flowerPrice);

    }

}