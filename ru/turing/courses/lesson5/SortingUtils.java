package ru.turing.courses.lesson5;

import ru.turing.courses.lesson5.abstractions.Comparer;

public class SortingUtils {
    public static <T> void sort(T[] array, Comparer<T> comparer) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] == null) {
                    continue;
                } else if ((array[j] == null) || comparer.mustBeSwapped(array[j], array[j + 1])) {
                    T c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
        }
    }
}
