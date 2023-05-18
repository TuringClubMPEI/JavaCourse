package ru.turing.courses.lesson3.byazrov;

public class Key {
    private static Integer key = 0;

    public static Integer generateKey(){
        ++key;
        return key;
    }
}
