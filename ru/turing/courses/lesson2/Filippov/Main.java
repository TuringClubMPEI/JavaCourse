package ru.turing.courses.lesson2.Filippov;

import ru.turing.courses.lesson2.Filippov.car.Bus;
import ru.turing.courses.lesson2.Filippov.car.SportCar;

public class Main {
    public static void main(String[] args) {
        SportCar porshe = new SportCar("Porshe 991 turbo s", 320, Transmission.AUTOMATICS, true);
        SportCar mclaren = new SportCar("McLaren 720s", 330, Transmission.AUTOMATICS, true);
        Bus bus1 = new Bus("Электробус", 170, Transmission.AUTOMATICS, false);

        System.out.println(porshe.getName());
        porshe.canDoLaunchStart();
        porshe.gas();
        porshe.move();

        System.out.printf("Сравниваем два объекта:%s и %s = %b\n", porshe.getName(), mclaren.getName(), porshe.equals(mclaren));//сравнивали по наличию launch starta
        System.out.printf("Сравниваем два объекта по hashCode:%s и %s = %b\n", porshe.getName(), mclaren.getName(), porshe.hashCode() == mclaren.hashCode());
        System.out.printf("Сравниваем два объекта по адресу:%s и %s = %b\n", porshe.getName(), mclaren.getName(), porshe == mclaren);
        System.out.println(bus1.getName());

        bus1.touristBus();
        bus1.gas();
        bus1.move();
        System.out.println();

    }
}