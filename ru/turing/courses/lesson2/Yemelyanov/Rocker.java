package ru.turing.courses.lesson2.Yemelyanov;

public class Rocker extends Animal {

    private String name;
    private String rockerClass;

    public Rocker(String name, String gorshokClass, int penisLength, String color) { //Конструктор с параметрами
        super(penisLength, color);
        this.name = name;

        this.penisLength = penisLength;

    }

    @Override
    public void makeSound() {
        System.out.println("Панки хой! Горшок живой!!");
    }

    @Override
    public void classify() {
        System.out.println("Является " + getRockerClass() + "и российским человеком, имя ему - " + getName());
    }

    public void setRockerClass(String rockerClass) {
        this.rockerClass = rockerClass;
    }

    public String getRockerClass() {
        return rockerClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printPenisLength() {
        System.out.println("Длина дрына Горшка - " + getPenisLength() + "см, но на самом деле он безграничен! Панки хой!");
    }
}
