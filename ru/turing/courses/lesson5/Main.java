package ru.turing.courses.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ms1 = new int[15];
        for (int i = 0; i < 15; i++) {
            ms1[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(ms1));
        int[] ms1sorted = new int[0];
        try {
            ms1sorted = Sorter.sortBubble(ms1);
        } catch (NullPointerException e) {
            System.out.println("Got null instead of not-null object");
        }

        System.out.println(Arrays.toString(ms1sorted) + "\n--------------");

        String[] ms2 = new String[10];
        char[] alphabet = "ABCDEFGHIJ".toCharArray();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                ms2[i] = null;
            }
            else {
                ms2[i] = i + Character.toString(alphabet[i]).repeat((int) (Math.random() * 100) % 20);
            }
        }
        System.out.println(Arrays.toString(ms2));
        String[] ms2sorted = new String[0];
        try {
            ms2sorted = Sorter.sortBubble(ms2);
        } catch (NullPointerException e) {
            System.out.println("Got null instead of not-null object");
        }
        System.out.println(Arrays.toString(ms2sorted) + "\n--------------");

        LocalMonkey[] ms3 = LocalMonkey.newMonkeys();

        for (LocalMonkey elem : ms3) {
            elem.print();
        }
        LocalMonkey[] ms3sorted = new LocalMonkey[0];
        try {
            ms3sorted = Sorter.sortBubble(ms3);
        } catch (NullPointerException e) {
            System.out.println("Got null instead of not-null object");
        }
        for (LocalMonkey elem : ms3sorted) {
            elem.print();
        }
    }
}
