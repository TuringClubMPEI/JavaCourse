package ru.turing.courses.lesson2.privalov;

import ru.turing.courses.lesson2.privalov.studying.Schooler;
import ru.turing.courses.lesson2.privalov.studying.Student;
import ru.turing.courses.lesson2.privalov.studying.Studying;

public class SolutionStudying {
    public static void main(String[] args) {
        //объявляем экземпляры
        Studying petya = new Schooler(8);
        Studying vasya = new Student();

        //проверяем реализацию методов на школьнике
        petya.study();
        petya.passExam(false);
        petya.passExam(true);

        //проверяем реализацию методов на студенте
        vasya.study();
        vasya.passExam(false);
        vasya.passExam(true);
    }
}
