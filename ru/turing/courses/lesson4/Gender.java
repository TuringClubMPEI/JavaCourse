package ru.turing.courses.lesson4;

/**
 * Пол человека
 *
 * @author diagorn
 */
public enum Gender {
    MALE("Male", 'M', "Мужской пол"),
    FEMALE("Female", 'F', "Женский пол"),
    HELICOPTER("Helicopter", 'H', "Вертолёт"),
    DEER("Deer", 'D', "Олень"),
    BUS("Bus", 'B', "Автобус"),
    BUMBLBEE("Bumblbee", 'B', "Бамблби :)");



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

    public static Gender ofName(String name) throws GenderException  {
        Gender gender = null;

        if (name == null)
            throw new GenderException("Переданный параметр name -> null");
        for (Gender g: Gender.values()) {
                if (name.equalsIgnoreCase(g.name)) {
                    gender = g;
                    break;
                }
        }
        if (gender == null)
            throw new GenderException("Такого пола не существует!");


        return gender;
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderException  {
        //todo реализовать с кастомным эксепшном
        Gender gender = null;

        if (shortNameRepr == null)
            throw new GenderException("Переданный параметр shortNameRepr -> null");
        for (Gender g: Gender.values()) {
            if (shortNameRepr.equals(g.shortNameRepr)) {
                gender = g;
                break;
            }
        }

        if (gender == null)
            throw new GenderException("Такого пола не существует!");

        return gender;
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
