package ru.turing.courses.lesson5.Karashtina;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Объекты класса Car для сортировки
        Car BMWm5 = new Car(4000, "M5", 5000000);
        Car BMWSeries7 = new Car(1000, "Series7", 4500000);
        Car BMWiX = new Car(500, "iX", 10000000);

        System.out.print("Введите длину массива: ");
        Scanner insert = new Scanner(System.in);
        int size = insert.nextInt();

        int[] arrayInt = new int[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arrayInt[i] = insert.nextInt();
        }
        //Сортировка массива чисел
        BubbleSort.bubbleSort(arrayInt);
        System.out.println("Отсортированный массив чисел: ");
        for (int element : arrayInt)
            System.out.print(element + " ");

        System.out.print("\nВведите длину массива строк: ");
        int length = insert.nextInt();
        System.out.print("Введите строки: ");
        String[] arrayString = new String[length];
        insert.nextLine();
        for (int i = 0; i < length; i++) {
            arrayString[i] = insert.nextLine();
        }
        //Сортировка массива строк
        BubbleSort.bubbleSort(arrayString);
        System.out.print("Отсортированный массив строк: ");
        System.out.println(Arrays.toString(arrayString));

        //Создаем массив из объектов и сортируем по полям
        Car[] arrayCar = {BMWm5, BMWSeries7, BMWiX};

        System.out.print("Отсортированный по полю id массив объектов: ");
        BubbleSort.bubbleSort(arrayCar, CarEnum.ID);
        for (Car element : arrayCar) {
            System.out.print(element.getId() + " ");
        }
        System.out.print("\n");

        System.out.print("Отсортированный по полю model массив объектов: ");
        BubbleSort.bubbleSort(arrayCar, CarEnum.MODEL);
        for (Car element : arrayCar) {
            System.out.print(element.getModel() + " ");
        }
        System.out.print("\n");

        System.out.print("Отсортированный по полю price массив объектов: ");
        BubbleSort.bubbleSort(arrayCar, CarEnum.PRICE);
        for (Car element : arrayCar) {
            System.out.print(element.getPrice() + " ");
        }
    }
}
