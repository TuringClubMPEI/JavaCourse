package ru.turing.courses.lesson2.animals;

public class Cat extends Animal {
    private boolean wanna_play; // 1 - want to ... 0 - don't want to
    private int mice_count = 0;
    private double hapiness;

    public void petTheCat() {
        hapiness += 1.0;
        System.out.println("Mrrrr");
    }

    public double getHapiness () {return hapiness;}

    public void cath_mouse() {
        mice_count += 1;
    }

    public int getMice_count() {
        return mice_count;
    }

    public boolean isWanna_play() {
        return wanna_play;
    }

    public void setWanna_play(boolean wanna_play) {
        this.wanna_play = wanna_play;
    }

    @Override
    public void sound() {
        System.out.println("Meooow!");
    }
}
