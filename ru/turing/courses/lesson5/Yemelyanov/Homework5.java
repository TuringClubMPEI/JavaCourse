package ru.turing.courses.lesson5.Yemelyanov;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Guitar schecter = new Guitar(1234, "Schecter", 7700);
        Guitar gibson = new Guitar(1236, "Gibson", 4000);
        Guitar cort = new Guitar(1345, "Cort", 2000);
        Guitar jackson = new Guitar(5643, "Jackson", 3100);

        BubbleSort bSort = new BubbleSort();

        System.out.print("Введите длину массива: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] intArr = new int[length];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < length; i++) {
            intArr[i] = input.nextInt();
        }

        System.out.println("Введите строки: ");
        String[] stringArr = new String[length];

        input.nextLine();
        for (int i = 0; i < length; i++) {
            stringArr[i] = input.nextLine();
        }

        intArr = bSort.sort(intArr);
        stringArr = bSort.sort(stringArr);

        System.out.print("Отсортированный массив чисел: ");
        for(int elem : intArr){
            System.out.print(elem + " ");
        }
        System.out.print("\n");

        System.out.print("Отсортированный массив строк: ");
        for(String elem : stringArr){
            System.out.print(elem + " ");
        }

        System.out.print("\n");
        Guitar[] guitarArr = {schecter, gibson, cort, jackson};

        System.out.print("Отсортированный по полю id массив объектов: ");
        guitarArr = bSort.sort(guitarArr, GuitarFieldEnum.ID_FIELD);
        for(Guitar elem : guitarArr){
            System.out.print(elem.getId() + " ");
        }
        System.out.print("\n");

        System.out.print("Отсортированный по полю name массив объектов: ");
        guitarArr = bSort.sort(guitarArr, GuitarFieldEnum.NAME_FIELD);
        for(Guitar elem : guitarArr){
            System.out.print(elem.getName() + " ");
        }
        System.out.print("\n");

        System.out.print("Отсортированный по полю price массив объектов: ");
        guitarArr = bSort.sort(guitarArr, GuitarFieldEnum.PRICE_FIELD);
        for(Guitar elem : guitarArr){
            System.out.print(elem.getPrice() + " ");
        }
        System.out.print("\n");

    }
}
