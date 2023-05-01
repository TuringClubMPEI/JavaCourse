package ru.turing.courses.lesson3.Zheleznov;
import java.util.HashMap;
import java.util.Map;
import ru.turing.courses.lesson3.Zheleznov.Registry;
import java.util.*;
public class Homework3 {
    public static void main(String[] args) {
        //создание объектов
        Car ladaPriora = new SportsCar(1, 200, 2);
        Car niva = new Suv(2, 160, 4);
        Car nissanGtr = new SportsCar(3, 320, 6);
        //создание мапы
        Registry<Car> carRegistry = new Registry<>();
        carRegistry.add(nissanGtr.getCarId(), nissanGtr);
        carRegistry.add(niva.getCarId(), niva);
        carRegistry.add(ladaPriora.getCarId(), ladaPriora);
        List<Integer> keys = carRegistry.removeByValue(niva);
        System.out.println(keys);
        carRegistry.removeByKey(3);
        carRegistry.printMaxSpeed();
    }
}
