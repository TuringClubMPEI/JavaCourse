package ru.turing.courses.lesson2.animals;

public class Cat extends Animal {
    private boolean wannaPlay; // 1 - want to ... 0 - don't want to
    private int miceCount = 0;
    private double hapiness;
    private String name;
    public void setMiceCount(int miceCount) {
        this.miceCount = miceCount;
    }

    public void setHapiness(double hapiness) {
        this.hapiness = hapiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Cat() {}
    public Cat(String type, int age, String color, boolean wannaPlay, int miceCount, double hapiness, String name) {
        super(type, age, color);
        this.wannaPlay = wannaPlay;
        this.miceCount = miceCount;
        this.hapiness = hapiness;
        this.name = name;
        this.age = age;
    }
//public Cat() {super(String type, int age, String color);}


    public void petTheCat() {
        hapiness += 1.0;
        System.out.println("Mrrrr");
    }

    public double getHapiness () {return hapiness;}

    public void cath_mouse() {
        hapiness += 1.0;
        miceCount -= 1;
    }

    public int getMiceCount() {
        return miceCount;
    }

    public boolean isWannaPlay() {
        return wannaPlay;
    }

    public void setWannaPlay(boolean wannaPlay) {
        this.wannaPlay = wannaPlay;
    }

    @Override
    public void sound() {
        System.out.println("Meooow!");
    }
}
