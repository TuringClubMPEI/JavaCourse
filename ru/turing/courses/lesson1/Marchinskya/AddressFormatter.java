package ru.turing.courses.lesson1.Marchinskya;

/**
 * Класс для форматирования адреса
 */
public class AddressFormatter {
    private static final String ADDRESS_DELIMITER = ",";
    private static final String ADDRESS_PARTS_DELIMITER = ":";

    /**
     * Метод для валидации адреса
     *
     * @param address адрес в формате "страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24"
     */
    public static void validate(String address) throws Exception {
        String[] addressParts = address.split(ADDRESS_DELIMITER);
        AddressPart[] parts = AddressPart.values();
        if (addressParts.length < parts.length) {
            throw new Exception("Невалидный адрес: недостаточно параметров");
        }
        for (int i = 0; i < parts.length; i++) {
            String part = addressParts[i].split(ADDRESS_PARTS_DELIMITER)[0].trim();
            if (!part.equals(parts[i].getCode())) {
                throw new Exception("Невалидный адрес " + part);
            }
        }
    }

    /**
     * Метод для форматирования
     *
     * @param address   адрес в формате "страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24"
     * @param delimiter разделитель частей адреса
     * @param prefs     префиксы для замены частей адреса. Пример для префикса "г": "город: Москва" -> "г. Москва"
     */
    public static String formatAddress(String address, String delimiter, String[] prefs) {
        String[] addressParts = address.split(ADDRESS_DELIMITER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < addressParts.length; i++) {
            sb.append(prefs[i]).append(addressParts[i].split(ADDRESS_PARTS_DELIMITER)[1].trim()).append(delimiter);
        }
        return sb.toString();
    }
}

/**
 * Типы частей адреса
 *
 * @code код части адреса
 */
enum AddressPart {
    COUNTRY("страна"),
    CITY("город"),
    STREET("улица"),
    HOUSE("дом"),
    FLAT("квартира");
    private final String code;

    AddressPart(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
