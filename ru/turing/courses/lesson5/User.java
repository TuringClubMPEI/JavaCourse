package ru.turing.courses.lesson5;

public class User {
    private long id;
    private String name;
    private char symbol;

    public User(long id, String name, char symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void printUser(){
        System.out.print(id + " " + name + " " + symbol + "\n");
    }

}
