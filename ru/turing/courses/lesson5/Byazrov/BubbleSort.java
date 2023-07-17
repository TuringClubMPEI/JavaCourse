package ru.turing.courses.lesson5.Byazrov;

import java.lang.reflect.Field;
import java.util.LinkedList;

public class BubbleSort <T>{
    /**
     *
     * Сортирует входной массив по возрастанию значений
     * @param array входной массив типа int
     */
    public static void intArray(int[] array) {
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
     * @param inputStringArray входной массив строк
     * @throws NullPointerException если массив строк не инициализирован
     */
    public static void stringArrayByLength(String[] inputStringArray) throws NullPointerException {

        if (inputStringArray == null) {
            throw new NullPointerException("Массив строк не инициализирован");
        }


        int nullElemCounter = 0;

        LinkedList<String> nonNullString = new LinkedList<>();

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
     * @param array входной массив объектов
     * @param fieldName поле, по которому проводится сортировка
     * @param <T> переменная типа входного массива
     * @throws NoSuchFieldException если у объекта не существует указанного fieldName поля
     */
    public static <T> void sortObjectsArray (T[] array, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = array[0].getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        int length = array.length;
        if (field.get(array[0]) instanceof String) {
            for (int j = 0; j < length; j++) {
                for (int i = 0; i < length - 1; i++) {
                    if (field.get(array[i]) == null || (field.get(array[i+1]) != null &&
                            field.get(array[i]).toString().length() > field.get(array[i+1]).toString().length())) {
                        T temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        } else if (field.get(array[0]) instanceof Number){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - 1; j++) {
                    if (((Number)field.get(array[j])).longValue() > ((Number)field.get(array[j+1])).longValue()) {
                        T temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}
