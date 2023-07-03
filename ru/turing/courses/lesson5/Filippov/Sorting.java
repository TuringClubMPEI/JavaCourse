package ru.turing.courses.lesson5.Filippov;

public class Sorting {
    public static int[] bubbleSortInt(int[] array) {
        Boolean checkSwap = true;
        int i = 0;
        int temp;
        while (i < array.length && checkSwap) {
            System.out.print(i + 1 + ")");
            checkSwap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    checkSwap = true;
                }
            }
            for (int t : array) {
                System.out.print(t + " ");
            }
            System.out.println();
            i++;
        }
        return array;
    }
    public static String[] bubbleSortString(String[] array) {
        Boolean checkSwap = true;
        String temp;
        int size = array.length;
        int i = 0;
        for (int t = 0; t < size; t++) {
            if (array[t] == null) {
                while (size != 0 && array[size - 1] == null && size - 1 != t) {
                    size--;
                }
                if (size - 1 != t && size != 0) {
                    array[t] = array[size - 1];
                    array[size - 1] = null;
                    size--;
                } else {
                    size--;
                }
            }
        }
        while (i < size && checkSwap) {
            System.out.print(i + 1 + ")");
            checkSwap = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    checkSwap = true;
                }
            }
            for (String t : array) {
                System.out.print("'" + t + "' ");
            }
            System.out.println();
            i++;
        }
        return array;
    }

    public static BankUser[] bubbleSortBankUsers(BankUser[] array, int key) {
        Boolean checkSwap = true;
        BankUser temp;
        if (array==null){
            System.out.println("Вы передали в процедуру null вместо массива");
        }
        else {
            int size = array.length;
            int i = 0;
            for (int t = 0; t < size; t++) {
                if (array[t] == null) {
                    while (size != 0 && array[size - 1] == null && size - 1 != t) {
                        size--;
                    }
                    if (size - 1 != t && size != 0) {
                        array[t] = array[size - 1];
                        array[size - 1] = null;
                        size--;
                    } else {
                        size--;
                    }
                }
            }
            while (i < size && checkSwap) {
                System.out.print(i + 1 + ")");
                checkSwap = false;
                for (int j = 0; j < size - i - 1; j++) {
                    switch (key) {
                        case 0:
                            if (array[j].getId() > array[j + 1].getId()) {
                                checkSwap = true;
                            }
                            break;
                        case 1:
                            if (array[j].getAmountOfMoney() > array[j + 1].getAmountOfMoney()) {
                                checkSwap = true;
                            }
                            break;
                        case 2:
                            if (array[j].getAge() > array[j + 1].getAge()) {
                                checkSwap = true;
                            }
                            break;
                        default:
                            System.out.println("Неверный ключ(0<=key<3)\n");
                            return array;
                    }
                    if (checkSwap) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;

                    }
                }
                for (BankUser t : array) {
                    System.out.print("[" + t.getId() + "," + t.getAmountOfMoney() + "," + t.getAge() + "] ");
                }
                System.out.println();
                i++;
            }
        }
        return array;
    }
}
