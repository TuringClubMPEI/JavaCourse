package ru.turing.courses.lesson3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rose redRose = new Rose(1, "red", 90);
        Tulip yellowTulip = new Tulip(2, "yellow", 50);
        Tulip whiteTulip = new Tulip(3, "white", 60);
        Registry<Flower> flowerRegistry = new Registry<>();
        flowerRegistry.add(redRose.getFlowerId(), redRose);
        flowerRegistry.add(4, redRose);
        flowerRegistry.add(yellowTulip.getFlowerId(), yellowTulip);
        flowerRegistry.add(whiteTulip.getFlowerId(), whiteTulip);
        List<Integer> keys = flowerRegistry.removeByValue(redRose);
        List<Flower> values = flowerRegistry.getByName("yellow");
        flowerRegistry.printColorOfFlowers();
        System.out.println(values);
        System.out.println(keys);


    }
}