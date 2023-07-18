package ru.turing.courses.lesson5.Byazrov;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    /**
     * Сортирует входной массив по возрастанию значений
     *
     * @param array входной массив типа int
     * @throws IllegalArgumentException если массив не инициализирован
     */
    public static void intArray(int[] array) throws IllegalArgumentException {
        if (array == null) {
            throw new IllegalArgumentException("Целочисленный массив не инициализирован");
        }

        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Сортирует входной массив строк в порядке возрастания длины строки
     *
     * @param inputStringArray входной массив строк
     * @throws IllegalArgumentException если массив строк не инициализирован
     */
    public static void stringArrayByLength(String[] inputStringArray) throws IllegalArgumentException {

        if (inputStringArray == null) {
            throw new IllegalArgumentException("Массив строк не инициализирован");
        }

        int nullElemCounter = 0;

        List<String> nonNullString = new ArrayList<>();

        for (String elem : inputStringArray) {
            if (elem != null) {
                nonNullString.add(elem);
            } else {
                ++nullElemCounter;
            }
        }

        String[] stringArray = nonNullString.toArray(new String[inputStringArray.length]);

        String temp;
        for (int i = 0; i < stringArray.length - 1 - nullElemCounter; i++) {
            for (int j = 0; j < stringArray.length - 1 - i - nullElemCounter; j++) {
                if (stringArray[j].length() > stringArray[j + 1].length()) {
                    temp = stringArray[j];
                    stringArray[j] = stringArray[j + 1];
                    stringArray[j + 1] = temp;
                }
            }
        }
        System.arraycopy(stringArray, 0, inputStringArray, 0, inputStringArray.length);
    }


    /**
     * Сортирует входной массив array по указанному полю в порядке возрастания значений поля.
     * Если тип поля String - сортировка проводится по возрастанию длины строки
     * Если тип поля Number - сортировка проводится по возрастанию значения
     *
     * @param array     входной массив объектов
     * @param fieldName поле, по которому проводится сортировка
     * @param <T>       переменная типа входного массива
     * @throws IllegalArgumentException если массив не инициализирован или имя поле null
     */
    public static <T extends User> void sortObjectsArray(T[] array, UserFields fieldName) throws IllegalArgumentException {

        if (array == null || fieldName == null) {
            throw new IllegalArgumentException();
        }

        int length = array.length;
        T temp;

        switch (fieldName) {

            case USER_ID:
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - 1 - i; j++) {
                        if (array[j].getId() > array[j + 1].getId()) {
                            temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                break;

            case USER_NAME:
                for (int j = 0; j < length; j++) {
                    for (int i = 0; i < length - 1; i++) {
                        if (array[i].getName() == null || array[i + 1].getName() != null &&
                                array[i].getName().length() > array[i + 1].getName().length()) {
                            temp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = temp;
                        }
                    }
                }
                break;

            case USER_SURNAME:
                for (int j = 0; j < length; j++) {
                    for (int i = 0; i < length - 1; i++) {
                        if (array[i].getSurname() == null || array[i + 1].getSurname() != null &&
                                array[i].getSurname().length() > array[i + 1].getSurname().length()) {
                            temp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = temp;
                        }
                    }
                }
                break;
        }
    }
}
