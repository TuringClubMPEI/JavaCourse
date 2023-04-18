package ru.turing.courses.lesson2.Filippov.Car;

public abstract class Car {
    protected int maxSpeed;
    private String name;
    private Transmission transmission;

    public Car(String name, int maxSpeed, Transmission transmission) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;

    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public abstract void gas();

}

enum MachineType {
    SEDANS, HATCHBACK, PICKUPS, MINIVANS, COUPE;
}

enum Transmission {
    AUTOMATICS, MECHANIСS;
}

