package ru.turing.courses.lesson3.Karashtina;

//создаем класс Fruit - наследника класса Product
public class Fruit extends Product {
    private String colour;

    public Fruit(Integer id, String name, Integer cost, Integer weigth, String colour) {
        super(id, name, cost, weigth);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    //строковое представление объекта Fruit
    @Override
    public String toString() {
        return "Fruit{" +
                "key = " + getId() +
                ", value = " + getName() +
                ", cost = " + getCost() +
                ", weight = " + getWeigth() +
                ", colour = " + getColour() + '}';
    }
}
