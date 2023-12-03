package ru.turing.courses.lesson5;

import ru.turing.courses.lesson5.abstractions.Comparer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparer<Integer> intComparer = (int1, int2) -> int1 > int2;
        Comparer<String> strComparer = (str1, str2) -> str1.length() > str2.length();
        Comparer<User> userIdComparer = (user1, user2) -> user1.getId() > user2.getId();
        Comparer<User> userAgeComparer = (user1, user2) -> user1.getAge() > user2.getAge();
        Comparer<User> userBalanceComparer = (user1, user2) -> user1.getBalance() > user2.getBalance();

        Integer[] intArr = {-8, 10, 3, 4, 1};
        String[] strArr = {"AAAA", "AAA", "R", "RRR"};
        User[] userArr = {new User(100008, 255, 15), new User(100002, 16, 355), new User(100005, 55, 33)};

        try {
            SortingUtils.<Integer>sort(intArr, intComparer);
            System.out.println(Arrays.toString(intArr));
            SortingUtils.<String>sort(strArr, strComparer);
            System.out.println(Arrays.toString(strArr));
            SortingUtils.<User>sort(userArr, userIdComparer);
            printUserArray(userArr, "ID sorting: ");
            SortingUtils.<User>sort(userArr, userAgeComparer);
            printUserArray(userArr, "Age sorting: ");
            SortingUtils.<User>sort(userArr, userBalanceComparer);
            printUserArray(userArr, "Balance sorting: ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printUserArray(User[] userArr, String comment) {
        StringBuilder sb = new StringBuilder();
        sb.append(comment);
        for (User user : userArr) {
            sb.append("{").append(user.getId()).append(", ");
            sb.append(user.getAge()).append(", ");
            sb.append(user.getBalance()).append("}");
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
