package ru.turing.courses.lesson5;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    /**
     * Сортировка пузырьком массива целых чисел от большей длины к меньшей.
     *
     * @param arr массив, который нужно отсортировать.
     * @return отсортированный массив.
     * @throws NullPointerException генерирует исключение, если массив ссылается на null.
     */
    public static int[] sortMaxToMin(int[] arr) throws NullPointerException {
        if (arr == null) {
            throw new NullPointerException();
        } else {
            for (int j = 1; j < arr.length; j++) {
                boolean flg = false;
                for (int i = 0; i < arr.length - j; i++) {
                    if (arr[i] < arr[i + 1]) {
                        int buff = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = buff;
                        flg = true;
                    }
                }
                if (!flg) break;
            }
            return arr;
        }
    }

    /**
     * Сортировка пузырьком массива строк от большей длины к меньшей.
     *
     * @param arr массив, который нужно отсортировать.
     * @return отсортированный массив.
     * @throws NullPointerException генерирует исключение, если массив ссылается на null.
     */
    public static String[] sortMaxToMin(String[] arr) throws NullPointerException {
        if (arr == null) {
            throw new NullPointerException();
        } else {
            for (int j = 1; j < arr.length; j++) {
                boolean flg = false;
                for (int i = 0; i < arr.length - j; i++) {
                    if (arr[i] == null) {
                        if (arr[i + 1] != null) {
                            arr[i] = arr[i + 1];
                            arr[i + 1] = null;
                            flg = true;
                        }
                    } else {
                        if ((arr[i + 1] != null) && ((arr[i].length() < arr[i + 1].length()))) {
                            StringBuilder buff = new StringBuilder(arr[i + 1]);
                            arr[i + 1] = arr[i];
                            arr[i] = buff.toString();
                            flg = true;
                        }
                    }
                }
                if (!flg) break;
            }
            return arr;
        }
    }

    /**
     * Сортировка пузырьком массива собственного класса от большего к меньшему по всем полям этого класса.
     *
     * @param arr массив, который нужно отсортировать.
     * @return отсортированный массив.
     * @throws NullPointerException генерирует исключение, если массив ссылается на null.
     */
    public static Employee[] sortMaxToMin(Employee[] arr) throws NullPointerException {
        if (arr == null) {
            throw new NullPointerException();
        } else {
            for (int j = 1; j < arr.length; j++) {
                boolean flg = false;
                for (int i = 0; i < arr.length - j; i++) {
                    if (arr[i].getId() == null) {
                        if (arr[i + 1].getId() != null) {
                            Employee buff = arr[i + 1];
                            arr[i + 1] = arr[i];
                            arr[i] = buff;
                            flg = true;
                        }
                    } else {
                        if (arr[i + 1].getId() != null) {
                            if (arr[i].getId() < arr[i + 1].getId()) {
                                Employee buff = arr[i + 1];
                                arr[i + 1] = arr[i];
                                arr[i] = buff;
                                flg = true;
                            } else if (arr[i].getId().equals(arr[i + 1].getId())) {
                                if (arr[i].getName() == null) {
                                    if (arr[i + 1].getName() != null) {
                                        Employee buff = arr[i + 1];
                                        arr[i + 1] = arr[i];
                                        arr[i] = buff;
                                        flg = true;
                                    }
                                } else {
                                    if (arr[i + 1].getName() != null) {
                                        if (arr[i].getName().length() < arr[i + 1].getName().length()) {
                                            Employee buff = arr[i + 1];
                                            arr[i + 1] = arr[i];
                                            arr[i] = buff;
                                            flg = true;
                                        } else if (arr[i].getName().length() == arr[i + 1].getName().length()) {
                                            if (arr[i].getSurname() == null) {
                                                if (arr[i + 1].getSurname() != null) {
                                                    Employee buff = arr[i + 1];
                                                    arr[i + 1] = arr[i];
                                                    arr[i] = buff;
                                                    flg = true;
                                                }
                                            } else {
                                                if (arr[i + 1].getSurname() != null) {
                                                    if (arr[i].getSurname().length() < arr[i + 1].getSurname().length()) {
                                                        Employee buff = arr[i + 1];
                                                        arr[i + 1] = arr[i];
                                                        arr[i] = buff;
                                                        flg = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!flg) break;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        var arrEmployee = new Employee[5];
        var arrIntId = new int[5];
        var arrStrName = new String[5];
        {
            arrEmployee[0] = new Employee(1L, "oleg", "olegov");
            arrEmployee[1] = new Employee(null, "oleg", "orlov");
            arrEmployee[2] = new Employee(6L, null, "kuskovov");
            arrEmployee[3] = new Employee(2L, "kolya", null);
            arrEmployee[4] = new Employee(10L, "artem", "olegovov");
        }
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getId() != null) {
                arrIntId[i] = arrEmployee[i].getId().intValue();
            } else {
                arrIntId[i] = 0;
            }
            arrStrName[i] = arrEmployee[i].getName();
        }
        try {
            var sortArrEmployee = Main.sortMaxToMin(arrEmployee);
            var sortArrIntId = Main.sortMaxToMin(arrIntId);
            var sortArrStrName = Main.sortMaxToMin(arrStrName);

            for (int i = 0; i < 5; i++) {
                System.out.println(sortArrIntId[i]);
                System.out.println(sortArrStrName[i]);
                System.out.println(sortArrEmployee[i]);
            }
        }
        catch (NullPointerException e){
            System.out.println("Есть массив null!");
        }

    }
}
