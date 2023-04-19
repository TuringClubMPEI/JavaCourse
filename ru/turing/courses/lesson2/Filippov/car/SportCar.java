package ru.turing.courses.lesson2.Filippov.car;

import ru.turing.courses.lesson2.Filippov.Transmission;

import java.util.Objects;

public class SportCar extends Car {
    private boolean launchStart;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportCar sportCar = (SportCar) o;
        return launchStart == sportCar.launchStart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchStart);
    }

    public SportCar(String name, int maxSpeed, Transmission transmission, boolean launchStart) {
        super(name, maxSpeed, transmission);
        this.launchStart = launchStart;
    }

    public void canDoLaunchStart() {
        if (launchStart) {
            System.out.println("Эта машина может заупстить тебя в космос(у нее есть launch start)");
        } else {
            System.out.println("launch start нет, но можно поставить stage");
        }
    }

    @Override
    public void move() {
        System.out.printf("Стиль вождения: Максимальная скорость %d %s", maxSpeed, "шашки по городу\n");
        return;
    }

    @Override
    public void gas() {
        if (maxSpeed >= 280) {
            System.out.println("98 бензин");
        } else {
            if (maxSpeed >= 280 & launchStart) {
                System.out.println("100 бензин");
            } else {
                System.out.println("95 бензин");
            }
        }
    }
}
