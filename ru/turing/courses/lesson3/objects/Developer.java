package ru.turing.courses.lesson3.objects;

public class Developer extends User {
    public Developer(String id, String nickname) {
        super(id, nickname, 0);
    }

    public Developer(String id, String nickname, int balance) {
        super(id, nickname, balance);
    }

    public void magicCommand() {
        this.addBalance(9999999);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
