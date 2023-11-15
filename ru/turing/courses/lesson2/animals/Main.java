package ru.turing.courses.lesson2.animals;

public class Main {
    public static void main(String[] args){
        Mammals Tiger = new Mammals();
        Tiger.setTemperature(50);
        Tiger.setHabitat();
        System.out.println(Tiger.getHabitat());
    }
}
