package ru.turing.courses.lesson2.Yemelyanov;

import java.util.Objects;

public class Rocker extends Animal {

    private String name;
    private String rockerClass;

    public Rocker(String name, String rockerClass, int penisLength, String color) { //Конструктор с параметрами
        super(penisLength, color);
        this.name = name;
        this.rockerClass = rockerClass;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocker rocker = (Rocker) o;
        return penisLength == rocker.penisLength &&
                color.equals(rocker.color) &&
                Objects.equals(name, rocker.name) &&
                Objects.equals(rockerClass, rocker.rockerClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rockerClass, penisLength, color);
    }
}
