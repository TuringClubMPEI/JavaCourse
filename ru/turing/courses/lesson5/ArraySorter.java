package ru.turing.courses.lesson5;

/**
 * класс для сортировки пузырьком
 *
 * @author MayLin
 */
public class ArraySorter {
    //метод для сортировки integer массива
    public static void bubbleSort(Integer[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("не принимает на вход null массив");
        }
        int lenght = array.length;
        while (lenght != 0) {
            int max_index = 0;
            for (int i = 1; i < lenght; i++) {
                if (array[i - 1] > array[i]) {
                    int buffer = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = buffer;
                    max_index = i;
                }
            }
            lenght = max_index;
        }
    }
    //метод для сортировки String массива
    public static void bubbleSort(String[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("не принимает на вход null массив");
        }
        int lenght = array.length;
        while (lenght != 0) {
            int max_index = 0;
            for (int i = 1; i < lenght; i++) {
                if (array[i - 1] == null || (array[i] != null && array[i - 1].length() > array[i].length())) {
                    String buffer = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = buffer;
                    max_index = i;
                }
            }
            lenght = max_index;
        }
    }
    //метод для сортировки F1Car массива
    public static void bubbleSort(F1Car[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("не принимает на вход null массив");
        }
        int lenght = array.length;
        while (lenght != 0) {
            int max_index = 0;
            for (int i = 1; i < lenght; i++) {
                if (array[i - 1] == null || (array[i] != null &&array[i - 1].compareTo(array[i]) > 0)) {
                    F1Car buffer = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = buffer;
                    max_index = i;
                }
            }
            lenght = max_index;
        }
    }


}
