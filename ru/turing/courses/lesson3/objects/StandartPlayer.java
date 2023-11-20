package ru.turing.courses.lesson3.objects;

public class StandartPlayer extends User {
    public StandartPlayer(String id, String nickname) {
        super(id, nickname, 0);
    }

    public StandartPlayer(String id, String nickname, int balance) {
        super(id, nickname, balance);
    }
}
