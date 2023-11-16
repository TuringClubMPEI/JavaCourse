package ru.turing.courses.lesson2.animals;

public abstract class Animal {
    private String foodType; //тип питания
    private String Habitat; //среда обитания

    public abstract void makeSounds(); //этот метод нужно определить в наследниках

    public Animal(String foodType, String habitat) {
        this.foodType = foodType;
        this.Habitat = habitat;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }
}
