package ru.turing.courses.lesson5;

/**
 * Исключение с сообщением
 */
public class NullArrayException extends IllegalArgumentException {
    public NullArrayException(String message) {
        super(message);
    }

}
