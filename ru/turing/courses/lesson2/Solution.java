package ru.turing.courses.lesson2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User mike = new User();
        mike.setFio();
        mike.setDateOfBirth();
        mike.setAddress();
        System.out.println(mike.getFio());
        System.out.println(mike.getDateOfBirth());
        mike.getAddress();
        System.out.println("Количество полных лет: " + mike.fullYearCount());
        System.out.println("Количество прожитых месяцев: " + mike.fullMonthCount());
    }
}
