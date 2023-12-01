package ru.turing.courses.lesson4;

/**
 * Класс ошибки показывающий что пол не найден
 */
public class IllegalGenderException extends IllegalArgumentException {
    /**
     * Конструктор исключения без параметров
     */
    public IllegalGenderException() {
    }

    /**
     * Конструктор исключения без параметров
     *
     * @param s не сущетсвующий гендер, который привел к ошибке
     */
    public IllegalGenderException(String s) {
        super(s);
    }
}
