package ru.turing.courses.lesson2.animals;

public class Dog extends Animal {
    private boolean owner_missing; // 1 or 0
    private boolean is_alone_at_home;
    private double hapiness;
    @Override
    public void sound() {
        System.out.println("Gav!Gav!Gav!");
    }

    public boolean isOwner_missing() {
        return owner_missing;
    }

    public void goForAWalk() {
        this.hapiness += 5.0;
    }

    public void setIs_alone_at_home(boolean aloneAtHome) {
        this.is_alone_at_home = aloneAtHome;
        if (aloneAtHome) {
            this.owner_missing = true;
            this.hapiness -= 1.0;
        }

    }


}
