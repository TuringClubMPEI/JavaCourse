package ru.turing.courses.lesson2.animals;
import java.util.Scanner;
public class Mammals extends Animal {
    private int temperature;
    private String habitat; // наземной, воздушной, почвенной и водной
    private String diet; //травоядное, хищник, насекомоядное

    public Mammals(int temperature, String habitat,  String diet) {
        this.temperature = temperature;
        this.habitat = habitat;
        this.diet = diet;
    }

    public Mammals(int weight, String colour, int lifespan, int numberOfLimbs, int temperature, String habitat, String diet) {
        super(weight, colour, lifespan, numberOfLimbs);
        this.temperature = temperature;
        this.habitat = habitat;
        this.diet = diet;
    }

    public Mammals() {
    }

    @Override
    public void makeSound() {
        System.out.println("шур-шур");
    }

    public int getTemperature() {
        System.out.print("Температура: ");
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat() {
        System.out.println("наземный / воздушный / почвенный / водный");
        Scanner in = new Scanner(System.in);
        this.habitat = in.next();
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        System.out.println("травоядное / хищник / насекомоядное");
        this.diet = diet;
    }
}
