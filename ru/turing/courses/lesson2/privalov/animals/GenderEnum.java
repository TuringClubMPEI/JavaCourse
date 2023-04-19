package ru.turing.courses.lesson2.privalov.animals;

public enum GenderEnum { //объявляем enum с вариантами пола
    //перечисляем варианты пола
    MALE("мужской"),
    FEMALE("женский");

    //задаем поле с описанием
    private final String description;

    //конструктор и геттер
    GenderEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
