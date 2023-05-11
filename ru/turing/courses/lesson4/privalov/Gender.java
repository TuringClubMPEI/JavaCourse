package ru.turing.courses.lesson4.privalov;

import java.util.Objects;

/**
 * Пол человека
 *
 * @author diagorn
 */
public enum Gender {
    MALE("Male", 'M', "Мужской пол"),
    FEMALE("Female", 'F', "Женский пол");


    /** Техническое название */
    private final String name;
    /** Символьное представление */
    private final char shortNameRepr;
    /** Описание */
    private final String description;

    Gender(String name, char shortNameRepr, String description) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
    }

    /**
     *
     * @param name вводимое enum-наименование пола, приводимое внутри к верхнему регистру
     * @return возвращает пол, найденный по имени, либо выбрасывает исключение
     */
    public static Gender ofName(String name) {
        if (name == null) {
            throw new GenderNotFoundException("Пустое значение");
        }

        Gender genderReturn = null;
        for(Gender gender: Gender.values()){
            if (Objects.equals(name.toUpperCase(), gender.name())){
                genderReturn = gender;
            }
        }

        if (genderReturn==null) {
            throw new GenderNotFoundException("Не найдено");
        }

        return genderReturn;
    }

    /**
     *
     * @param shortNameRepr -- вводимая буква пола
     * @return возвращает пол, соответствующий введенной букве, либо выкидывает исключение
     */
    public static Gender ofShortNameRepr(Character shortNameRepr) {
        Gender genderReturn = null;

        if (shortNameRepr == null) {
            throw new GenderNotFoundException("Пустое значение");
        }

        Character shortNameReprUpperCase = Character.toUpperCase(shortNameRepr);
        for(Gender gender: Gender.values()){
            if (Objects.equals(shortNameReprUpperCase, gender.getShortNameRepr())){
                genderReturn = gender;
            }
        }
        if (genderReturn==null) {
            throw new GenderNotFoundException("Не найдено");
        }
        return genderReturn;
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
