package ru.turing.courses.lesson5;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInteger = {3, 2002, 6};
        String[] arrString = {"уеду", "Я", "жить в Лондон", null, "и не в Лондон..", ",а может быть,"};
        F1Car[] arrF1Car = {new F1Car(1L, "Mercedes", 10),
                null,
                new F1Car(2L, "Ferrari", 20),
                new F1Car(1L, "Lotus", 9)};
        //сортировка пузырьком для массива с integer значениями
        ArraySorter.bubbleSort(arrInteger);
        //сортировка пузырьком для массива с String значениями
        ArraySorter.bubbleSort(arrString);
        //сортировка пузырьком для массива с F1Car значениями
        ArraySorter.bubbleSort(arrF1Car);
        Arrays.stream(arrInteger).forEach(System.out::println);
        System.out.println("---------------------------------");
        Arrays.stream(arrString).forEach(System.out::println);
        System.out.println("---------------------------------");
        Arrays.stream(arrF1Car).forEach(System.out::println);


    }
}
