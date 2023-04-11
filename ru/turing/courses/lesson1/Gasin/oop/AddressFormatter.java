package ru.turing.courses.lesson1.Gasin.oop;

/**
 * Интерфейс форматирования адреса
 */
@FunctionalInterface
public interface AddressFormatter {
    /**
     * Отформатировать адрес
     * @param address - адрес под форматирование
     * @return отоформатированную строку
     */
    String format(String address);
}
