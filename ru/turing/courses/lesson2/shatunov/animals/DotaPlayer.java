package ru.turing.courses.lesson2.shatunov.animals;

import ru.turing.courses.lesson2.shatunov.animals.basic.Animal;
import ru.turing.courses.lesson2.shatunov.animals.basic.IBeerEnjoyer;

public class DotaPlayer extends Animal implements IBeerEnjoyer {

    private int playedDotaHours;
    public DotaPlayer(String name, int age, float weight, int playedDotaHours) {
        super(name, age, weight);
        this.playedDotaHours = playedDotaHours;
    }
    @Override
    public void move(){
        System.out.println("...");
    }
    public void playDota(int hours){
        if (hours <= 0){
            return;
        }
        playedDotaHours += hours;
    }
    public int getPlayedDotaHours() {
        return playedDotaHours;
    }

    @Override
    public void drinkBeer(float beerAmount) {
        if (beerAmount <= 0){
            return;
        }
        super.eat(beerAmount);
        System.out.println("...");
    }
}
