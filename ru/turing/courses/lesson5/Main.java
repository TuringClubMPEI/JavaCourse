package ru.turing.courses.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ms1 = new int[15];
        for (int i = 0; i < 15; i++) {
            ms1[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(ms1));
        int[] ms1sorted = Sorter.sortBubble(ms1);

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

        ArrayList<LocalMonkey> ms3 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of monkeys: ");
        int quantity3 = in.nextInt();
        for (int i = 0; i < quantity3; i++) {
            ms3.set(i, new LocalMonkey());
        }

        for (LocalMonkey elem : ms3) {
            System.out.println(elem.toString());
        }
        List<LocalMonkey> ms3sorted = new ArrayList<>();
        try {
            ms3sorted = Sorter.sortBubble(ms3);
        } catch (NullPointerException e) {
            System.out.println("Got null instead of not-null object");
        }
        for (LocalMonkey elem : ms3sorted) {
            System.out.println(elem.toString());
        }
    }
}
