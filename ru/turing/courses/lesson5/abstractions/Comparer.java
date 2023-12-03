package ru.turing.courses.lesson5.abstractions;

@FunctionalInterface
public interface Comparer<T> {
    boolean mustBeSwapped(T t1, T t2);
}
