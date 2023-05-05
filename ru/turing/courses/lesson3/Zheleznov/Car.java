package ru.turing.courses.lesson3.Zheleznov;

import java.util.Objects;

public abstract class Car {
    private int carId;
    private int carMaxSpeed;
    private int engineCapacity;

    public Car(int carId, int carMaxSpeed, int engineCapacity) {
        this.carId = carId;
        this.carMaxSpeed = carMaxSpeed;
        this.engineCapacity = engineCapacity;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarName(int carId) {
        this.carId = carId;
    }

    public int getCarMaxSpeed() {
        return carMaxSpeed;
    }

    public void setCarMaxSpeed(int carMaxSpeed) {
        this.carMaxSpeed = carMaxSpeed;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carMaxSpeed == car.carMaxSpeed && engineCapacity == car.engineCapacity && Objects.equals(carId, car.carId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carMaxSpeed, engineCapacity);
    }
}
