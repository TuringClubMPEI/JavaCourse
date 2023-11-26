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

    public static Gender ofName(String name) throws GenderNotFoundException, NullPointerException {
        if (name == null){
            throw new NullPointerException();
        }
        for (Gender gender : Gender.values()) {
            if (gender.getName().equalsIgnoreCase(name)) {
                return gender;
            }
        }
        throw new GenderNotFoundException(String.format("gender with name %s not found", name));
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderNotFoundException, NullPointerException {
        if (shortNameRepr == null || shortNameRepr.toString().isBlank()){
            throw new NullPointerException();
        }
        for (Gender gender : Gender.values()) {
            if (gender.getShortNameRepr() == shortNameRepr) {
                return gender;
            }
        }
        throw new GenderNotFoundException(String.format("gender with short name %s not found", shortNameRepr));
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
