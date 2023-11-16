package ru.turing.courses.lesson2.animals;

public class Cat extends Animal {
    private static String speciesName = "SillyOne";
    private boolean ippyness;
    private boolean silly;
    private static int notSillyAge = 10;

    public void Age(int time) {
        GetHungry(time);
        age += time;
        ippyness = true;
    }

    public void Cat(int age, int hunger, String name, boolean ippyness) {
        super.Animal(age, hunger, name);
        this.ippyness = ippyness;
        if (age < notSillyAge)
            this.silly = true;
        else
            this.silly = false;
    }

    public void BeSilly() {
        silly = true;
    }

    @Override
    public String toString() {
        if (silly)
            return speciesName+"{" +
                    "name=" + name +
                    ";Age=" + age +
                    "ippyness is " + ippyness +
                    ";hunger=" + hunger +
                    "Warning, Significantly Silly!" +
                    '}';
        return "Cat{" +
                "name=" + name +
                ";Age=" + age +
                "ippyness=" + ippyness +
                "hunger=" + hunger +
                "Not Silly" +
                '}';
    }
}
