package ru.turing.courses.lesson5;

import java.util.ArrayList;

public class Sorter {
    public static int[] sortBubble(int[] mas) throws NullPointerException {
        if (mas == null)
            throw new NullPointerException("Empty array!");
        int buf;
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    buf = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buf;
                }
            }
        }
        System.out.println("Sorted successfully!");
        return mas;
    }

    public static String[] sortBubble(String[] mas) throws NullPointerException{
        if (mas == null) {
            throw new NullPointerException("Empty array!");
        }
        String buf;
        int a, b;
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] == null) {
                    a = -1;
                } else {
                    a = mas[j].length();
                }
                if (mas[j + 1] == null) {
                    b = -1;
                } else {
                    b = mas[j + 1].length();
                }
                if (a > b || a == -1) {
                    buf = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buf;
                }
            }
        }
        System.out.println("Sorted successfully!");
        return mas;
    }
    /**
     * Returns sorted ArrayList<LocalMonkey>.
     * Criteria by importance:
     *  1.  Availability of a banana (False -> True)
     *  2.  ID (low -> high)
     *  3.  name (по предикату greaterThen)
     * @param mas - unsorted ArrayList
     * @return sorted version of mas
     */
    public static ArrayList<LocalMonkey> sortBubble(ArrayList<LocalMonkey> mas) throws NullPointerException {
        if (mas == null) {
            throw new NullPointerException("Empty array!");
        }
        LocalMonkey buf;
        int critBanana, critId, critName;
        boolean makeSort;
        for (int i = 0; i < mas.size() - 1; i++) {
            for (int j = 0; j < mas.size() - i - 1; j++) {
                critBanana = 0;
                critId = 0;
                critName = 0;
                makeSort = false;
                if (mas.get(j).hasBanana() && !mas.get(j + 1).hasBanana()) {
                    critBanana = 1;
                } else if (!mas.get(j).hasBanana() && mas.get(j + 1).hasBanana()) {
                    critBanana = 2;
                }
                if (mas.get(j).getId() > mas.get(j + 1).getId()) {
                    critId = 1;
                } else if (mas.get(j).getId() < mas.get(j + 1).getId()) {
                    critId = 2;
                }
                if (stringFormater.greaterThen(mas.get(j).getName(), mas.get(j + 1).getName())) {
                    critName = 1;
                }
                if (critBanana == 1) {
                    makeSort = true;
                } else if (critBanana != 2) {
                    if (critId == 1) {
                        makeSort = true;
                    } else if (critId != 2) {
                        makeSort = critName == 1;
                    }
                }
                if (makeSort) {
                    buf = mas.get(j);
                    mas.set(j, mas.get(j + 1));
                    mas.set(j, buf);
                }
            }
        }
        System.out.println("Sorted successfully!");
        return mas;
    }
}
