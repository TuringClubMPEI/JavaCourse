package ru.turing.courses.lesson5.Yemelyanov;

public interface Sort {
    public int[] bubbleSort(int[] unsortedIntArr);
    public String[] bubbleSort(String[] unsortedStringArr);
    public Guitar[] bubbleSort(Guitar[] guitar, Field field);
}