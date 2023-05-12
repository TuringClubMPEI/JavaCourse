package ru.turing.courses.lesson3.Karashtina;

//Создаем абстрактный класс Product
public abstract class Product {
    private Integer id;
    private String name;
    private Integer cost;
    private Integer weigth;

    public Product(Integer id, String name, Integer cost, Integer weigth) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.weigth = weigth;
    }

    //прописываем геттеры к полям класса
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getWeigth() {
        return weigth;
    }
}
