package ru.turing.courses.lesson2.animals;

public class Emu extends Animal {
    private static String speciesName = "Emu";
    private double neckLength;

    public void Age(int time) {
        GetHungry(time);
        this.neckLength -= 0.0001*time;
        age+=time;
    }

    public void Emu(int age, int hunger, String name, double neckLength) {
        super.Animal(age, hunger, name);
        this.neckLength = neckLength;
    }

    public void Fly() throws Exception {
        throw new Exception("Duh");
    }

    public Emu LayEgg() {
        System.out.println("Make Australia cry!");
        return new Emu();
    }

    @Override
    public String toString() {
        return speciesName+"{" +
                "name=" + name +
                ";Age=" + age +
                "neckLength=" + neckLength +
                "hunger=" + hunger +
                '}';
    }
}
