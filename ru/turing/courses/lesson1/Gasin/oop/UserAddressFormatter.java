package ru.turing.courses.lesson1.Gasin.oop;

import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Форматтер пользовательского адреса
 *
 * @author diagorn
 */
public final class UserAddressFormatter implements AddressFormatter {

    /**
     * Мапа соответствия того, что надо заменить, и того, на что заменять
     */
    private static final Map<String, String> REPLACES = Map.of(
            "город:", UserAddressPrefixEnum.CITY.getValue(),
            "улица:", UserAddressPrefixEnum.STREET.getValue(),
            "дом:", UserAddressPrefixEnum.HOUSE.getValue(),
            "квартира:", UserAddressPrefixEnum.FLAT.getValue()
    );
    /**
     * Регулярное выражение адреса для проверки валидности
     */
    private static final String ADDRESS_REGEX = "страна: ?[А-я][а-я]+, ?город: ?[А-Я][а-я]+, " +
            "?улица: ?(([А-я][а-я]+)|([А-я][а-я]+ [А-я][а-я]+)), ?дом: ?[0-9]+, ?квартира: ?[0-9]+";

    private void validate(String address) throws AddressValidationException {
        Pattern pattern = Pattern.compile(ADDRESS_REGEX);
        Matcher matcher = pattern.matcher(address);
        if (!matcher.matches()) {
            throw new AddressValidationException(
                    String.format("Введённый адрес невалиден:\n%s", address)
            );
        }
    }

    @Override
    public String format(String address) throws AddressValidationException {
        try {
            validate(address);
        } catch (AddressValidationException e) {
            //тут вообще должно быть логирование, но будет вывод в консоль
            System.out.println("Ошибка при парсинге адреса");
            throw e;
        }

        StringBuilder result = new StringBuilder();
        Arrays.stream(address.split(", "))
                .map(part -> {
                    for (String replaceable: REPLACES.keySet()) {
                        if (part.startsWith(replaceable)) {
                            return part.replace(replaceable, REPLACES.get(replaceable));
                        }
                    }
                    return part;
                })
                .forEach(part -> result.append(part).append("\n"));
        return result.toString();
    }
}
