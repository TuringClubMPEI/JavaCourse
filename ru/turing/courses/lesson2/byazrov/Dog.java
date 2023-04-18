package ru.turing.courses.lesson2.byazrov;

import java.util.Objects;

public class Dog extends Animal {

    private boolean isHound;
    private int maxHowlDuration; //in seconds

    public Dog(String name, int age, boolean isHound, int howLongCanHowlInSec) {
        super(name, age);
        this.isHound = isHound;
        this.maxHowlDuration = maxHowlDuration;
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("woof-woof");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Woof-woof!! *your dog looks at you with happiness in his eyes and wags his tail*");
    }

    public void setHound(boolean hound) {
        isHound = hound;
    }

    public void setHowLongCanHowlInSec(int howLongCanHowlInSec) {
        this.maxHowlDuration = howLongCanHowlInSec;
    }

    public boolean isHound() {
        return isHound;
    }

    public int getHowLongCanHowlInSec() {
        return maxHowlDuration;
    }

    public void howl() {
        System.out.println("Dog howled");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return isHound == dog.isHound && maxHowlDuration == dog.maxHowlDuration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHound, maxHowlDuration);
    }
}
