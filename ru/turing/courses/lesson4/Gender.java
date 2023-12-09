package ru.turing.courses.lesson4;

public enum Gender {
    MALE("Male", 'M', "Мужской пол"),
    FEMALE("Female", 'F', "Женский пол");

    //Техническое название
    private final String name;
    private final Character shortNameRepr;
    private final String description;

    Gender(String name, Character shortNameRepr, String description) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
    }

    public static Gender ofName(String name) throws GenderDoesNotExist {
        if (name == null) {
            throw new GenderDoesNotExist("Гендер не найден");
        }
        for (Gender gender : Gender.values()) {
            if (gender.getName().equalsIgnoreCase(name)) {
                return gender;
            }
        }
        throw new GenderDoesNotExist("Существует только 2 гендера.");
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderDoesNotExist {

        if (shortNameRepr == null) {
            throw new GenderDoesNotExist("Гендер не должен быть null");
        }

        for (Gender gender : Gender.values()) {
            if (gender.getShortNameRepr().equals(shortNameRepr)) {
                return gender;
            }
        }

        throw new GenderDoesNotExist("Гендер не найден");
    }

    public String getName() {
        return name;
    }

    public Character getShortNameRepr() {
        return shortNameRepr;
    }

    public String getDescription() {
        return description;
    }
}
