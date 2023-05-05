package ru.turing.courses.lesson5.Imanov;
import java.util.Objects;

/**
 * Класс сортирующий массивы
 * @author itimur
 */

public class ArraySorter {

    private static <T> void swap(T[] array, int index1, int index2){
        T buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    /**
     * sort(null) -> null
     * sort([3, 1, 2]) -> [1, 2, 3]
     * @param array - массив, который нужно отсортировать
     */
    public static void sort(Integer[] array) {
        if (array == null) {
            return;
        }

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - i - 1; ++j){
                if (array[j + 1] == null || (array[j + 1] != null && array[j] > array[j + 1])){
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * sort(null) -> null
     * sort(["111", null, "1"]) -> ["1", "111", null]
     * @param array - массив, который нужно отсортировать
     */

    public static void sort(String[] array) {
        if (array == null) {
            return;
        }

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - i - 1; ++j){
                if (array[j] == null || (array[j + 1] != null && array[j].length() > array[j + 1].length())){
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * sort(null) -> null
     * sort([{52, 100, 2}, null, {52, 100, 1}]) -> [{52, 100, 1}, {52, 100, 2}, null]
     * @param array - массив, который нужно отсортировать
     */
    public static void sort(ScarfPlayer[] array){
        if (array == null) {
            return;
        }

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - i - 1; ++j){

                if (array[j] == null) {
                    swap(array, j, j + 1);
                } else if (array[j + 1] != null){
                    if (array[j].getId() >  array[j + 1].getId()){
                        swap(array, j, j + 1);
                    } else if (Objects.equals(array[j].getId(), array[j + 1].getId()) &&  array[j].getNumberOfWins() > array[j + 1].getNumberOfWins()){
                        swap(array, j, j + 1);
                    } else if (Objects.equals(array[j].getId(), array[j + 1].getId()) &&  array[j].getNumberOfWins() == array[j + 1].getNumberOfWins() &&
                            array[j].getAge() > array[j + 1].getAge()){
                        swap(array, j, j + 1);
                    }
                }

            }
        }
    }
}

