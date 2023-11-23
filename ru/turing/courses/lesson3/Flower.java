package ru.turing.courses.lesson3;

import java.util.Objects;

public abstract class Flower {
    private int flowerId;
    private String colorOfFlower;
    private int flowerPrice;

    public Flower(int flowerId, String colorOfFlower, int flowerPrice) {
        this.flowerId = flowerId;
        this.colorOfFlower = colorOfFlower;
        this.flowerPrice = flowerPrice;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getColorOfFlower() {
        return colorOfFlower;
    }

    public void setColorOfFlower(String colorOfFlower) {
        this.colorOfFlower = colorOfFlower;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(int flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return flowerId == flower.flowerId && flowerPrice == flower.flowerPrice && Objects.equals(colorOfFlower, flower.colorOfFlower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerId, colorOfFlower, flowerPrice);
    }
}
