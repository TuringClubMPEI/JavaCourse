package ru.turing.courses.lesson5.Filippov;

public class BankUser {
    private long id;
    private double amountOfMoney;

    private int age;
    public BankUser(long id, double amountOfMoney, int age ){
        this.id=id;
        this.age=age;
        this.amountOfMoney=amountOfMoney;
    }

    public int getAge() {
        return age;
    }
    public long getId() {
        return id;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }
}