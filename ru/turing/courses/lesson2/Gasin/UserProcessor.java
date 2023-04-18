package ru.turing.courses.lesson2.Gasin;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Класс обработки информации о пользователе
 */
public class UserProcessor {
    /**
     * Посчитать, сколько прожил человек
     * @param birthDate - дата рождения человека
     * @param dimension - единица измерения ответа (года, месяца и так далее)
     * @return время жизни человека в заданной единице измерения
     */
    public int getLifespan(LocalDateTime birthDate, ChronoUnit dimension) {
        LocalDateTime now = LocalDateTime.now();

        if (birthDate == null || birthDate.isAfter(now)) {
            System.out.println("Ошибка! Введена неверная дата");
            return -1;
        }

        return (int) dimension.between(birthDate, now);
    }

    /**
     * Отформатировать адрес
     * @param userAddress - адрес, как его ввел пользователь
     * @return отформатированный адрес с новой строки и краткими названиями
     */
    public String formatAddress(String userAddress) {
        String[] addressParts = userAddress
                .replaceAll("страна: ", "")
                .replaceAll("город:", "г.")
                .replaceAll("улица:", "ул.")
                .replaceAll("дом:", "д.")
                .replaceAll("квартира:", "кв.")
                .split(", ");

        StringBuilder result = new StringBuilder();
        for (String addressPart: addressParts) {
            result.append(addressPart.trim()).append("\n");
        }

        return result.toString();
    }
}
