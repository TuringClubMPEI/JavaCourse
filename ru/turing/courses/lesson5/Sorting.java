package ru.turing.courses.lesson5;

/**
 * Класс сортировки, используется перегрузка
 */
public class Sorting {
    /**
     * перестановка 2-х элементов с индексами first, second массива String[]
     *
     * @param array
     * @param first
     * @param second
     */
    private static void swap(String[] array, int first, int second) {
        String buffer = array[first];
        array[first] = array[second];
        array[second] = buffer;
    }

    /**
     * перестановка 2-х элементов с индексами first, second массива int[]
     *
     * @param array
     * @param first
     * @param second
     */
    private static void swap(int[] array, int first, int second) {
        int buffer = array[first];
        array[first] = array[second];
        array[second] = buffer;
    }

    /**
     * сортировка пузырьком элементов в массиве String[]
     *
     * @param array
     */
    public static void bubbleSort(String[] array) {
        if (array == null) throw new NullArrayException("Array must be not null");
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {  //Внешний цикл
            for (int j = 0; j < len - i - 1; j++) {       //Внутренний цикл
                if (array[j + 1] != null) {
                    if (array[j] == null) {
                        swap(array, j, j + 1);
                    } else if (array[j].length() > array[j + 1].length()) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    /**
     * сортировка пузырьком для массива int[]
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        if (array == null) throw new NullArrayException("Array must be not null");
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {  //Внешний цикл
            for (int j = 0; j < len - i - 1; j++) {       //Внутренний цикл
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
