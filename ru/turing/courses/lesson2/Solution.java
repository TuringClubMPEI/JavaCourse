package ru.turing.courses.lesson2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User Mike = new User();
        Mike.setFio();
        Mike.setBirthOFdate();
        Mike.setAddress();
        System.out.println(Mike.getFio());
        System.out.println(Mike.getBirthOFdate());
        Mike.getAddress();
        System.out.println("Количество полных лет: " + Mike.FullYearCount());
        System.out.println("Количество прожитых месяцев: " + Mike.FullMonthCount());
    }
}
