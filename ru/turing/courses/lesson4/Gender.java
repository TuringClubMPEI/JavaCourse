package ru.turing.courses.lesson4;

public enum Gender {
    MALE("MALE", 'M', "Мужской пол"),
    FEMALE("FEMALE", 'F', "Женский пол");

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
            throw new GenderDoesNotExist("Гендер не может быть null");
        }
        for (Gender gender : Gender.values()) {
            if (gender.getName().equalsIgnoreCase(name)) {
                return gender;
            }
        }
        throw new GenderDoesNotExist("Существует только 2 гендера.");
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderDoesNotExist {

        if (shortNameRepr == '\n') {
            throw new GenderDoesNotExist("Гендер не моежет быть символом переноса строки");
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
