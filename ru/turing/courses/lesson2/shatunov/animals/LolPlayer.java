package ru.turing.courses.lesson2.shatunov.animals;

public class LolPlayer extends Human{

    private float skill;
    public LolPlayer(String name, int age, float weight, int workExperienceInYears, float skill) {
        super(name, age, weight, workExperienceInYears);
        this.skill = skill;
    }

    @Override
    public void drinkBeer(float beerAmount) {
        super.drinkBeer(beerAmount);
        skill += beerAmount * 2;
    }

    public void playLol(int hours){
        super.work(hours);
        skill += hours;
        System.out.println("Played lol");
    }
}
