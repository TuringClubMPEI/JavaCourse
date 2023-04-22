package ru.turing.courses.lesson3.Imanov.user;

import java.util.Objects;

public abstract class User {
    protected String UserName;
    protected int UserId;
    private static int countUser = 0;

    User(String UserName){
        countUser++;
        UserId = countUser;
        this.UserName = UserName;
    }

    public int getUserId(){
        return this.UserId;
    }

    public String getUserName(){
        return this.UserName;
    }

    public int getCountUser() {
        return countUser;
    }
}
