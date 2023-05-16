package ru.turing.courses.lesson4.Karashtina;

import java.util.Objects;

public enum Gender {
    MALE("Male", 'M', "Мужской пол"),
    FEMALE("Female", 'F', "Женский пол");
    /**
     * Техническое название
     */
    private final String name;
    /**
     * Символьное представление
     */
    private final char shortNameRepr;
    /**
     * Описание
     */
    private final String description;

    Gender(String name, char shortNameRepr, String description) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
    }

    //метод для поиска объекта по полю name
    public static Gender ofName(String name) {
        for (Gender gender : Gender.values()) {
            if (Objects.equals(gender.getName(), name)) {
                return gender;
            }
        }
        throw new GenderNotFoundException("Пол не найден");
    }

    //метод для поиска объекта по полю shortNameRepr
    public static Gender ofShortNameRepr(char shortNameRepr) {
        for (Gender gender : Gender.values()) {
            if (Objects.equals(gender.getShortNameRepr(), shortNameRepr)) {
                return gender;
            }
        }
        throw new GenderNotFoundException("Пол не найден");
    }

    public String getName() {
        return name;
    }

    public char getShortNameRepr() {
        return shortNameRepr;
    }

    public String getDescription() {
        return description;
    }
}

