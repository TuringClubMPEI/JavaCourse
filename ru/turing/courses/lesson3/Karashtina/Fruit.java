package ru.turing.courses.lesson3.Karashtina;

//создаем класс Fruit - наследника класса Product
public class Fruit extends Product {
    private String colour;

    public Fruit(Integer key, String value, Integer cost, Integer weigth, String colour) {
        super(key, value, cost, weigth);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    //строковое представление объекта Fruit
    public String toString() {
        return "Fruit{" +
                "key = " + getKey() +
                ", value = " + getValue() +
                ", cost = " + getCost() +
                ", weight = " + getWeigth() +
                ", colour = " + getColour() + '}';
    }
}
