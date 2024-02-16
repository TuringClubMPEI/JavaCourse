package ru.turing.courses.lesson5;

import java.util.Scanner;

public class LocalMonkey {
    private Long id;
    private String name;
    private boolean hasBanana;

    public String toString() {
        String ans = id.toString() + ") monkey " + name + " has";
        if (!hasBanana) ans = ans + "n't got";
        ans = ans + " a banana";
        return ans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasBanana() {
        return hasBanana;
    }

    public void setBanana(boolean hasBanana) {
        this.hasBanana = hasBanana;
    }

    public LocalMonkey(Long id, String name, boolean hasBanana) {
        this.id = id;
        this.name = name;
        this.hasBanana = hasBanana;
    }

    public LocalMonkey() {
        input();
    }

    public void input() {
        int banana;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID (int), name (String) and the presence of a banana (0/1) for a monkey:");
        this.id = in.nextLong();
        this.name = in.next();
        banana = in.nextInt();
        this.hasBanana = banana == 1;
    }
}
