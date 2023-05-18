package ru.turing.courses.lesson5.Yemelyanov;

public interface Sort {
    public int[] sort(int[] unsortedIntArr);
    public String[] sort(String[] unsortedStringArr);
    public Guitar[] sort(Guitar[] guitar, FieldCase field);
}