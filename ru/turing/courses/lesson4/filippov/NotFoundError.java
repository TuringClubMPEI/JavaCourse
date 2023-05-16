package ru.turing.courses.lesson4.filippov;

public class NotFoundError extends RuntimeException {
    String name=null;
    public NotFoundError(String name) {
        super();
        this.name = name;
    }
    public NotFoundError() {
        super();
    }
    public String reasonOfMistake() {
        if (name==null || name.length() == 0) {
            return "Вы ничего не ввели";
        }
        return "Такого enum нет";
    }
}

