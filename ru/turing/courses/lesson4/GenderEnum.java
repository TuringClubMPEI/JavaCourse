package ru.turing.courses.lesson4;

import java.util.Objects;

/**
 * Пол человека
 *
 * @author maylin
 */
public enum GenderEnum {
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

    GenderEnum(String name, char shortNameRepr, String description) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
    }

    public static GenderEnum ofName(String name) throws GenderNotFoundException {
        if (name == null) {
            throw new GenderNotFoundException("Имя не может быть null");
        }
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.getName().equalsIgnoreCase(name)) {
                return gender;
            }
        }

        throw new GenderNotFoundException("Гендера с таким именем не существует, придерживайтесь традициям :>");
    }

    public static GenderEnum ofShortNameRepr(Character shortNameRepr) throws GenderNotFoundException {
        if (shortNameRepr == null) {
            throw new GenderNotFoundException("Короткое имя не должно быть null");
        }
        for (GenderEnum gender : GenderEnum.values()) {
            if (shortNameRepr.equals(gender.getShortNameRepr())) {
                return gender;
            }
        }

        throw new GenderNotFoundException("Гендера с таким именем не существует");
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
