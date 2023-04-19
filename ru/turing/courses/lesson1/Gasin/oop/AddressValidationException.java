package ru.turing.courses.lesson1.Gasin.oop;

/**
 * Ошибка валидации адреса пользователя
 *
 * @author diagorn
 */
public class AddressValidationException extends RuntimeException {
    public AddressValidationException() {
        super();
    }

    public AddressValidationException(String message) {
        super(message);
    }

    public AddressValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressValidationException(Throwable cause) {
        super(cause);
    }

    protected AddressValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
