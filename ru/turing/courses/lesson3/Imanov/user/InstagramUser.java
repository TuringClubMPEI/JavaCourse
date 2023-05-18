package ru.turing.courses.lesson3.Imanov.user;

import java.util.Objects;

public class InstagramUser extends User {
    private boolean accountVerified;

    public InstagramUser(String UserName, boolean accountVerified) {
        super(UserName);
        this.accountVerified = accountVerified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstagramUser that = (InstagramUser) o;
        return accountVerified == that.accountVerified
                && UserId == that.UserId && Objects.equals(UserName, that.UserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountVerified);
    }

    @Override
    public String toString() {
        return "Имя: " + UserName + '\n' +
                "Id: " + UserId + '\n' +
                "Любимая категория: " + accountVerified + '\n';
    }
}
