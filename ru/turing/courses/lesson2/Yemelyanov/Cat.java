package ru.turing.courses.lesson2.Yemelyanov;

public class Cat extends Animal {

    private String animalClass;

    @Override
    public void getSound() {
        System.out.println("Мяуууу");
        return;
    }

    public Cat(String animalClass, int penisLength, String color) {
        this.animalClass = animalClass;
        this.penisLength = penisLength;
        this.color = color;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    @Override
    public void classifyAnimal() {
        System.out.println("Является котом (кошкой) ");
        return;
    }

    @Override
    public void getPenisLength() {
        System.out.println("Длина детородного органа кота (прости господи) составляет " + penisLength + " сантиметров");
    }
}
