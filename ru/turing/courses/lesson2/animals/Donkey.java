package ru.turing.courses.lesson2.animals;
import java.util.Scanner;
public class Donkey extends Animal{
    protected int maxWeightToTransport;
    protected int nowWeight;
    protected boolean isAlive;
    @Override
    public void makeSound() {
        System.out.print("Ia! Ia!\n");
    }
    public void tryLoad(int weight1) {
        int weight = weight1 + nowWeight;
        if (!isAlive) {
            System.out.print("You cannot load a dead donkey\n");
        } else {
            if (weight > maxWeightToTransport) {
                System.out.print("You really want it? y/n: ");
                Scanner in = new Scanner(System.in);
                String s = in.next();
                if (s.equals("y")) {
                    System.out.printf("Bad job, you killed your friend %s, he couldn't transfer so heavy load\n", name);
                } else {
                    System.out.print("OK\n");
                }
            } else {
                System.out.printf("%s's load is now %d/%d kg\n", name, weight, maxWeightToTransport);
                nowWeight = weight;
            }
        }
    }
    public void doSport(int time) {
        if (time > 180) {
            System.out.printf("%s didn't survive such a long activity. F\n", name);
            isAlive = false;
        } else {
            maxWeightToTransport += time / 60;
            System.out.printf("%s can now carry %d kg!\n", name, maxWeightToTransport);
        }
    }

    public Donkey() {
        isAlive = true;
        name = "Another";
    }

    public Donkey(String name, boolean isFlying, boolean isSwimming, int numberOfPaws, int age, int maxWeightToTransport, int nowWeight, boolean isAlive) {
        super(name, isFlying, isSwimming, numberOfPaws, age);
        this.maxWeightToTransport = maxWeightToTransport;
        this.nowWeight = nowWeight;
        this.isAlive = isAlive;
    }
}

