package ru.turing.courses.lesson2.Filippov.car;

import ru.turing.courses.lesson2.Filippov.Transmission;

import java.util.Objects;

public class Bus extends Car {
    private boolean isItTourist;

    public Bus(String name, int maxSpeed, Transmission transmission, boolean isItTourist) {
        super(name, maxSpeed, transmission);
        this.isItTourist = isItTourist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return isItTourist == bus.isItTourist;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isItTourist);
    }


    public void touristBus() {
        if (isItTourist) {
            System.out.println("Туристический автобус");
        } else {
            System.out.println("Обычный автобус");
        }
    }

    @Override
    public void move() {//
        System.out.println("Стиль вождения:Без шашек,зато можно по автобусной полосе");
    }

    @Override
    public void gas() {
        if (maxSpeed >= 180) {
            System.out.println("92 бензин");
        } else {
            if (maxSpeed >= 280 & isItTourist) {
                System.out.println("95 бензин");
            } else {
                System.out.println("Электрический");
            }
        }
    }
}
