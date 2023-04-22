package ru.turing.courses.lesson3.Imanov.user;

import java.util.Objects;

public class PornhubUser extends User {
    private String favoriteCategory;
    public PornhubUser(String UserName, String favoriteCategory){
        super(UserName);
        this.favoriteCategory = favoriteCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PornhubUser that = (PornhubUser) o;
        return UserId == that.UserId
                && Objects.equals(UserName, that.UserName) && Objects.equals(favoriteCategory, that.favoriteCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoriteCategory);
    }

    @Override
    public String toString() {
        return "Имя: " + UserName + '\n' +
                "Id: " + UserId + '\n' +
                "Любимая категория: "+ favoriteCategory + '\n';
    }
}
