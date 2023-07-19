package ru.turing.courses.lesson5.Byazrov;

/**
 * Используется для подстановки в аргумент метода BubbleSort.sortObjectsArray при его вызове
 */
public enum UserFields {
    USER_ID("id"),
    USER_NAME ("name"),
    USER_SURNAME ("surname");

    private final String fieldName;

    UserFields(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
