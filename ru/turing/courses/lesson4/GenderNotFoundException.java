package ru.turing.courses.lesson4;

/**
 * Вызывается, чтобы указать, что методу было передано недопустимое значение гендера.
 */
public class GenderNotFoundException extends IllegalArgumentException {
    /**
     * Создает исключение {@code GenderNotFoundException} без детального сообщения.
     */
    public GenderNotFoundException() {
        super();
    }

    /**
     * Создает исключение {@code GenderNotFoundException} с указанным детальным сообщением.
     *
     * @param message детальное сообщение.
     */
    public GenderNotFoundException(String message) {
        super(message);
    }

    /**
     * Создает исключение {@code GenderNotFoundException} с указанной причиной.
     *
     * @param cause указанная причина.
     */
    public GenderNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Создает исключение {@code GenderNotFoundException} с указанной причиной и детальным сообщением.
     *
     * @param message детальное сообщение.
     * @param cause   причина.
     */
    public GenderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
