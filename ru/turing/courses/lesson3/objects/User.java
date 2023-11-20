package ru.turing.courses.lesson3.objects;

import java.util.Objects;

public abstract class User {

    private final String id;
    private String nickname;
    private double balance;

    public User(String id, String nickname, int balance) {
        this.id = id;
        this.nickname = nickname;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        if (amount < 0) {
            return;
        }
        balance += amount;
    }

    public void handleDailyReward() {
        addBalance(1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
