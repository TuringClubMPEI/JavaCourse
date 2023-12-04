package ru.turing.courses.lesson5;

import java.util.Objects;

public class User {
    private long id;
    private int age;
    private double balance;

    public User(long id, int age, double balance) {
        this.id = id;
        this.age = age;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id) && Objects.equals(age, user.age) && Objects.equals(balance, user.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, balance);
    }
}
