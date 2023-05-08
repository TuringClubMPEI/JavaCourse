package ru.turing.courses.lesson3.Karashtina;

//Создаем абстрактный класс Product
public abstract class Product {
    private Integer key;
    private String value;
    private Integer cost;
    private Integer weigth;

    public Product(Integer key, String value, Integer cost, Integer weigth) {
        this.key = key;
        this.value = value;
        this.cost = cost;
        this.weigth = weigth;
    }

    //прописываем геттеры к полям класса
    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getWeigth() {
        return weigth;
    }
}
