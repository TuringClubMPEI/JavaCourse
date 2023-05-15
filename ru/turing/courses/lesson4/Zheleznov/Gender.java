package ru.turing.courses.lesson4.Zheleznov;

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
        if (name == null) {
            throw new GenderException("Пустое значение");
        }
        Gender genderOfName = null;
        for (Gender gender : Gender.values()) {
            if (Objects.equals(name.toUpperCase(), gender.name())) {
                genderOfName = gender;
            }
        }
        if (genderOfName == null) {
            throw new GenderException("значение не найдено");
        }
        return genderOfName;
    }

    //метод для поиска объекта по полю shortNameRepr
    public static Gender ofShortNameRepr(Character shortNameRepr) {
        if (shortNameRepr == null) {
            throw new GenderException("Пустое значение");
        }
        Gender genderOfShortName = null;
        for (Gender gender : Gender.values()) {
            if (Objects.equals(shortNameRepr, gender.shortNameRepr)) {
                genderOfShortName = gender;
            }
        }
        if (genderOfShortName == null) {
            throw new GenderException("значение не найдено");
        }
        return genderOfShortName;
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
