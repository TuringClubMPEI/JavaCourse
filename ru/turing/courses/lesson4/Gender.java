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

    public static Gender ofName(String name) throws GenderNotFoundException {
        if (name == null) {
            throw new GenderNotFoundException("Null name!");
        }

        for (Gender obj : values()) {
            if (obj.name.equalsIgnoreCase(name)) {
                System.out.println(name + " success!");
                return obj;
            }
        }
        throw new GenderNotFoundException("Not found gender with name " + name);

    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderNotFoundException {
        if (shortNameRepr == null) {
            throw new GenderNotFoundException("Null short name!");
        }

        for (Gender obj : values()) {
            if (obj.shortNameRepr == shortNameRepr) {
                System.out.println(shortNameRepr + " success!");
                return obj;
            }
        }
        throw new GenderNotFoundException("Not found gender with short name " + shortNameRepr);
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
