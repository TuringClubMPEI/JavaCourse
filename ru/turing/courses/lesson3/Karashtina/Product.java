package ru.turing.courses.lesson3.Karashtina;

//Создаем класс "продукт"
public class Product {
    private final Integer key;
    private final String value;

    public Product(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
    //прописываем геттеры к полям класса
    public Integer getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

}
