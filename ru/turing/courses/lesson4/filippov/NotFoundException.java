package ru.turing.courses.lesson4.filippov;

public class NotFoundException extends RuntimeException {
    String name=null;
    public NotFoundException(String name) {
        super();
        this.name = name;
    }
    public NotFoundException() {
        super();
    }@Override
    public String getMessage() {
        if (name==null || name.length() == 0) {
            return "Вы ничего не ввели";
        }
        return "Такого enum нет";
    }
}

