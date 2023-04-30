package ru.turing.courses.lesson3.Zheleznov;
import java.util.HashMap;
import java.util.Map;
import ru.turing.courses.lesson3.Zheleznov.Registry;
public class Homework3 {
    public static void main(String[] args) {
        //создание объектов
        Car LadaPriora = new SportsCar(1, 200, 2);
        Car Niva = new Suv(2, 160, 4);
        Car NissanGtr = new SportsCar(3, 320, 6);
        //создание мапы
        Registry<Car> CarRegistry = new Registry<>();
        CarRegistry.add(NissanGtr.getCarId(), NissanGtr);
        CarRegistry.add(Niva.getCarId(), Niva);
        CarRegistry.add(LadaPriora.getCarId(), LadaPriora);
        CarRegistry.removeByValue(Niva);
        CarRegistry.removeByKey(3);
        CarRegistry.coutMaxSpeed();
    }
}
