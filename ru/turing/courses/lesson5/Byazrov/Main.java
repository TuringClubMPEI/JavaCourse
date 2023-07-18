package ru.turing.courses.lesson5.Byazrov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 43, 12, 2, 42, 121};
        String[] strings = {null, null, "54321", "4321", "321", "21", "1", "1212123123"};
        String[] strings1 = {null, null, "1234", "123", null, "12345", null, "12", "1", null, null};
        String[] strings2 = null;

        try {
            BubbleSort.intArray(null);
            System.out.println(Arrays.toString(intArray));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            BubbleSort.stringArrayByLength(strings2);
            System.out.println(Arrays.toString(strings2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        User user1 = new User(3L, "Borissimo", null);
        User user2 = new User(4L, "Андрей", "Гаврилин");
        User user3 = new User(1L, "Pavel", "Bobkin");

        User[] users = {user1, user2, user3};
        User[] nullUsers = null;

        try {
            BubbleSort.sortObjectsArray(users, UserFields.USER_NAME);
            System.out.println(Arrays.toString(users));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
