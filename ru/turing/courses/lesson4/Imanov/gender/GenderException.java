package ru.turing.courses.lesson4.Imanov.gender;

public class GenderException extends RuntimeException {
    String what;
    public GenderException(String what) {
        this.what = what;
    }

    public String getWhat(){
        return what;
    }
}
