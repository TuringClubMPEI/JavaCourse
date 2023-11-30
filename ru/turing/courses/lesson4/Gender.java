package ru.turing.courses.lesson4;

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

    public static Gender ofName(String name) throws IllegalGenderException, NullPointerException {
        if (name == null) {
            throw new NullPointerException("Отправлен пустой класс...");
        }
        if (name.equalsIgnoreCase(MALE.name) || name.equalsIgnoreCase(FEMALE.name)) {
            if (name.equalsIgnoreCase(MALE.name)) {
                return MALE;
            } else {
                return FEMALE;
            }
        } else {
            throw new IllegalGenderException(name);
        }
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws IllegalGenderException, NullPointerException {
        if (shortNameRepr == null) {
            throw new NullPointerException("Отправлен пустой класс...");
        }
        if (shortNameRepr.toString().equalsIgnoreCase(Character.toString(MALE.shortNameRepr)) || shortNameRepr.toString().equalsIgnoreCase(Character.toString(FEMALE.shortNameRepr))) {
            if (shortNameRepr.toString().equalsIgnoreCase(Character.toString(MALE.shortNameRepr))) {
                return MALE;
            } else {
                return FEMALE;
            }
        } else {
            throw new IllegalGenderException(shortNameRepr.toString());
        }
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
