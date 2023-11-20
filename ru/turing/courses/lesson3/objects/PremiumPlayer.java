package ru.turing.courses.lesson3.objects;

public class PremiumPlayer extends User {
    public PremiumPlayer(String id, String nickname) {
        super(id, nickname, 0);
    }

    public PremiumPlayer(String id, String nickname, int balance) {
        super(id, nickname, balance);
    }

    @Override
    public void handleDailyReward() {
        addBalance(10);
    }
}
