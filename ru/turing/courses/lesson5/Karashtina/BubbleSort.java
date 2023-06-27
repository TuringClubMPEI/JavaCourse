package ru.turing.courses.lesson5.Karashtina;

public class BubbleSort {
    //метод для сортировки данных типа int
    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int j = 0; j < length - 1; j++) {
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    //метод для сортировки данных типа String
    public static void bubbleSort(String[] array) {
        int length = array.length;
        for (int j = 1; j < length; j++) {
            for (int i = 1; i < length; i++) {
                if (array[i] != null && array[i - 1] != null && array[i].length() > array[i - 1].length()) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                } else if (array[i] != null && array[i - 1] == null) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }

    //статик метод для сортировки данных массива класса
    public static Car[] bubbleSort(Car[] array, CarEnum car) {
        int length = array.length;
        switch (car) {
            case ID: {
                for (int j = 0; j < length; j++) {
                    for (int i = 0; i < length - 1; i++) {
                        if (array[j].getId() > array[i + 1].getId()) {
                            Car element = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = element;
                        }
                    }
                }
                break;
            }
            case MODEL: {
                for (int j = 0; j < length; j++) {
                    for (int i = 0; i < length - 1; i++) {
                        if (array[i].getModel() == null || (array[i + 1].getModel() != null &&
                                array[i].getModel().length() > array[i + 1].getModel().length())) {
                            Car element = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = element;
                        }
                    }
                }
                break;
            }
            case PRICE: {
                for (int j = 0; j < length; j++) {
                    for (int i = 0; i < length - 1; i++) {
                        if (array[j].getPrice() > array[i + 1].getPrice()) {
                            Car element = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = element;
                        }
                    }
                }
                break;
            }
        }
        return array;
    }
}
