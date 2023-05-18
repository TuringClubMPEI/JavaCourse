package ru.turing.courses.lesson4.filippov;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Пол человека
 *
 * @author diagorn
 */
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

    //todo реализовать с кастомным эксепшном
    public static Gender ofName(String name) {
        if (name == null) {
            throw new NotFoundException();
        }
        for (Gender gender : Gender.values()) {
            if (name.toUpperCase().equals(gender.name.toUpperCase())) {

                return gender;
            }
        }
        throw new NotFoundException(name);
    }

    //todo реализовать с кастомным эксепшном
    public static Gender ofShortNameRepr(Character shortNameRepr) {
        if (shortNameRepr == null) {
            throw new NotFoundException();
        }
        String shortName = String.valueOf(shortNameRepr);
        for (Gender gender : Gender.values()) {
            if (shortName.toUpperCase().equals(String.valueOf(gender.shortNameRepr).toUpperCase())) {

                return gender;
            }
        }
        throw new NotFoundException(String.valueOf(shortNameRepr));

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
