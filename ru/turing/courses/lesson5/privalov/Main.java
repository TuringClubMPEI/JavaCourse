package ru.turing.courses.lesson5.privalov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Иниц. целочисленный массив, сортируем пузырьком и выводим
        int[] integerArray = {10, 25, 65, 5, 71, 51, 3, 2002};
        BubbleSorter.bubbleSort(integerArray);
        System.out.println(Arrays.toString(integerArray));

        //Иниц. строчный массив, сортируем и выводим
        String[] stringArray = {null, "кодзима", "гений", "", "сдам", "гараж"};
        BubbleSorter.bubbleSort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        //Иниц. массив zoo с тремя животными, заполняем массив, сортируем и выводим
        Animal[] zoo = new Animal[3];
        zoo[0] = new Animal(10, "capybara igor", 28);
        zoo[1] = new Animal(25, "flamingo pinky", 10);
        zoo[2] = new Animal(85, "lion cat", 130);
        BubbleSorter.bubbleSort(zoo);
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
    }
}
