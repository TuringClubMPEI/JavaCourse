package ru.turing.courses.lesson1.Gasin.oop;


/**
 * Префиксы в адресе пользователя
 *
 * @author diagorn
 */
public enum UserAddressPrefixEnum {
    NONE(""),
    CITY("г."),
    STREET("ул."),
    HOUSE("д."),
    FLAT("кв.");

    private final String value;

    UserAddressPrefixEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
