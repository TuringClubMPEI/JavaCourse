package ru.turing.courses.lesson5.Imanov;
import java.util.Objects;

/**
 * Класс сортирующий массивы
 * @author itimur
 */

public class ArraySorter {

    /**
     * sort(null) -> IllegalArgumentException
     * sort([3, 1, 2]) -> [1, 2, 3]
     * @param array - массив, который нужно отсортировать
     */
    public static void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("int array is null");
        }

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - i - 1; ++j){
                if (array[j] > array[j + 1]){
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
    }

    /**
     * sort(null) -> IllegalArgumentException
     * sort(["111", null, "1"]) -> ["1", "111", null]
     * @param array - массив, который нужно отсортировать
     */

    public static void sort(String[] array) {
        if (array == null) {
            throw new IllegalArgumentException("String array is null");
        }

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - i - 1; ++j){
                if (array[j] == null || (array[j + 1] != null && array[j].length() > array[j + 1].length())){
                    String buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
    }

    /**
     * sort(null) -> IllegalArgumentException
     * sort([{52, 100, 2}, null, {52, 100, 1}]) -> [{52, 100, 1}, {52, 100, 2}, null]
     * @param array - массив, который нужно отсортировать
     */
    public static void sort(ScarfPlayer[] array){
        if (array == null) {
            throw new IllegalArgumentException("scarf player array is null");
        }

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - i - 1; ++j){
                if (array[j] == null || array[j + 1] != null && (
                        array[j].getId() >  array[j + 1].getId() ||
                        Objects.equals(array[j].getId(), array[j + 1].getId()) &&  array[j].getNumberOfWins() > array[j + 1].getNumberOfWins() ||
                        Objects.equals(array[j].getId(), array[j + 1].getId()) &&  array[j].getNumberOfWins() == array[j + 1].getNumberOfWins() &&
                        array[j].getAge() > array[j + 1].getAge()))
                {
                    ScarfPlayer buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
    }
}
