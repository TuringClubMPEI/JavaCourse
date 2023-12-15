package ru.turing.courses.lesson5;

import java.util.Scanner;

public class LocalMonkey {
    private Long id;
    private String name;
    private boolean hasBanana;

    public void print() {
        System.out.print(id.toString() + ") monkey " + name + " has");
        if (!hasBanana) System.out.print("n't got");
        System.out.println(" a banana");
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
    }

    public static LocalMonkey[] newMonkeys() {
        Scanner in = new Scanner(System.in);
        System.out.print("Print quantity of monkeys: ");
        int n = in.nextInt();
        LocalMonkey[] monkeys = new LocalMonkey[n];
        long id;
        String name;
        int banana;
        boolean ban;
        System.out.println(monkeys.length);
        for (int i = 0; i < monkeys.length; i++) {
            System.out.println("Print ID (int), name (String) and the presence of a banana (0/1) for a monkey:");
            id = in.nextLong();
            name = in.next();
            banana = in.nextInt();
            ban = banana == 1;
            monkeys[i] = new LocalMonkey(id, name, ban);
        }
        return monkeys;
    }
}
