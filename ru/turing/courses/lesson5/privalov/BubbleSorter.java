package ru.turing.courses.lesson5.privalov;

/**
 * Класс сортировщика пузырьком
 */
public class BubbleSorter {
    /**
     * Метод сортировки пузырьком по убыванию для массива целых чисел
     *
     * @param array - массив целых чисел
     *              <p>
     *              Изменяет изначальный массив
     */
    public static void bubbleSort(int[] array) {
        for (int step = 0; step < array.length - 1; step++) {
            for (int index = 0; index < array.length - 1 - step; index++) {
                if (array[index] < array[index + 1]) {
                    int buffer = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buffer;
                }
            }
        }
    }

    /**
     * Метод перестановки пузырьком по уменьшению длины элемента
     * для массива строк
     *
     * @param array входной массив строк
     */
    public static void bubbleSort(String[] array) {
        for (int step = 0; step < array.length - 1; step++) {
            for (int index = 0; index < array.length - 1 - step; index++) {
                if ((array[index] != null && array[index + 1] != null && array[index].length() < array[index + 1].length())
                        || (array[index] == null || array[index + 1] == null)) {
                    String buffer = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buffer;
                }
            }
        }
    }

    /**
     * Метод сортировки пузырьком для объектов класса Animal
     *
     * @param array массив объектов класса Animal
     */
    public static void bubbleSort(Animal[] array) {
        for (int step = 0; step < array.length - 1; step++) {
            for (int index = 0; index < array.length - 1 - step; index++) {
                if ((array[index] != null && array[index + 1] != null && array[index].compareTo(array[index + 1]) > 0)
                        || (array[index] == null || array[index + 1] == null)) {
                    Animal buffer = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buffer;
                }
            }
        }
    }

    public BubbleSorter() {
    }
}
