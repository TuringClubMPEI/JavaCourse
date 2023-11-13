package ru.turing.courses.lesson2.shatunov.animals;

import ru.turing.courses.lesson2.shatunov.animals.basic.Animal;
import ru.turing.courses.lesson2.shatunov.animals.basic.BeerEnjoyer;

public class Human extends Animal implements BeerEnjoyer {
    private int workExperienceInYears;

    public Human(String name, int age, float weight, int workExperienceInYears) {
        super(name, age, weight);
        this.workExperienceInYears = workExperienceInYears;
    }

    @Override
    public void drinkBeer(float beerAmount) {
        if (beerAmount <= 0){
            return;
        }
        super.eat(beerAmount);
        System.out.println("Drank beer");
    }

    public void work(int hours){
        if (hours <= 0){
            return;
        }
        workExperienceInYears += hours;
    }

    public int getWorkExperienceInYears() {
        return workExperienceInYears;
    }
}
