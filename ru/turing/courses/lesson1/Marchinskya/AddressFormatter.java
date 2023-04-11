package ru.turing.courses.lesson1.Marchinskya;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для форматирования адреса
 */
public class AddressFormatter {
    private static final String ADDRESS_DELIMITER = ",";
    private static final String ADDRESS_PARTS_DELIMITER = ":";

    private static final Map<String, String> partsMap = new HashMap<>() {
        {
            put("страна", "");
            put("город", "г. ");
            put("улица", "ул. ");
            put("дом", "д. ");
            put("квартира", "кв. ");
        }
    };

    /**
     * Метод для форматирования
     *
     * @param address   адрес в формате "страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24"
     * @param delimiter разделитель частей адреса
     */
    public static String formatAddress(String address, String delimiter)
            throws IllegalArgumentException {
        validate(address);
        String[] addressParts = address.split(ADDRESS_DELIMITER);
        StringBuilder sb = new StringBuilder();
        for (String addressPart : addressParts) {
            String[] p = addressPart.split(ADDRESS_PARTS_DELIMITER);
            sb.append(partsMap.get(p[0].trim())).append(p[1].trim()).append(delimiter);
        }
        return sb.toString();
    }

    /**
     * Метод для валидации адреса
     *
     * @param address адрес в формате "страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24"
     */
    private static void validate(String address) throws IllegalArgumentException {
        String[] addressParts = address.split(ADDRESS_DELIMITER);

        if (addressParts.length < partsMap.size()) {
            throw new IllegalArgumentException("Невалидный адрес: недостаточно параметров");
        }
        for (int i = 0; i < partsMap.size(); i++) {
            String part = addressParts[i].split(ADDRESS_PARTS_DELIMITER)[0].trim();
            if (!partsMap.containsKey(part)) {
                throw new IllegalArgumentException("Невалидный адрес " + part);
            }
        }
    }
}
