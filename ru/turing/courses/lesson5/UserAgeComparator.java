package ru.turing.courses.lesson5;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }

}
