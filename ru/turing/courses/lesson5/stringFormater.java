package ru.turing.courses.lesson5;

public class stringFormater {
    public static boolean greaterThen(String a, String b) {
        if (a == null) {
            return b != null;
        }
        boolean ans = true;
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i <minLength  && ans; i++) {
            ans = a.charAt(i) <= b.charAt(i);
        }
        if (ans) {
            return a.length() > b.length();
        }
        return false;
    }

}
