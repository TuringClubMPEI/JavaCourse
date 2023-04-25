package ru.turing.courses.lesson2.Yemelyanov;

public class Cat extends Animal {

    private String animalClass;

    @Override
    public void makeSound() {
        System.out.println("Мяуууу");
        return;
    }

    public Cat(String animalClass, int penisLength, String color) {
        super(penisLength, color);
        this.animalClass = animalClass;

    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

   @Override
    public void classify() {
        System.out.println("Является " + getAnimalClass());
        return;
    }
    @Override
    public void printPenisLength() {
        System.out.println("Длина детородного органа кота (прости господи) составляет " + getPenisLength() + " сантиметров");
    }
}
