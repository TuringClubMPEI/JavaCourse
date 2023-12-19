package ru.turing.courses.lesson5;

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
        if (mas == null)
            throw new NullPointerException("Empty array!");
        String buf;
        int a, b;
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] == null) {
                    a = 999;
                } else {
                    a = mas[j].length();
                }
                if (mas[j + 1] == null) {
                    b = 999;
                } else {
                    b = mas[j + 1].length();
                }
                if (a > b) {
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
     * ‘ункци€ возвращает отсортированный массив класса LocalMonkey.
     *  ритерии (по важности):
     *  1.  ≈сть ли банан (False -> True)
     *  2.  ID (low -> high)
     *  3.  name (по предикату greaterThen)
     * @param mas - изначальный массив LocalMonkey[]
     * @return отсортированна€ верси€ mas
     */
    public static LocalMonkey[] sortBubble(LocalMonkey[] mas) throws NullPointerException {
        if (mas == null)
            throw new NullPointerException("Empty array!");
        LocalMonkey buf;
        int crit1, crit2, crit3;
        boolean makeSort;
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                crit1 = 0;
                crit2 = 0;
                crit3 = 0;
                makeSort = false;
                if (mas[j].hasBanana() && !mas[j + 1].hasBanana()) {
                    crit1 = 1;
                } else if (!mas[j].hasBanana() && mas[j + 1].hasBanana()) {
                    crit1 = 2;
                }
                if (mas[j].getId() > mas[j + 1].getId()) {
                    crit2 = 1;
                } else if (mas[j].getId() < mas[j + 1].getId()) {
                    crit2 = 2;
                }
                if (stringFormater.greaterThen(mas[j].getName(), mas[j + 1].getName())) {
                    crit3 = 1;
                }
                if (crit1 == 1) {
                    makeSort = true;
                } else if (crit1 != 2) {
                    if (crit2 == 1) {
                        makeSort = true;
                    } else if (crit2 != 2) {
                        makeSort = crit3 == 1;
                    }
                }
                if (makeSort) {
                    buf = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buf;
                }
            }
        }
        System.out.println("Sorted successfully!");
        return mas;
    }
}
