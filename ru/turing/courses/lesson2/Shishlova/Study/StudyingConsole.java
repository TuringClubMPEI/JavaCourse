package ru.turing.courses.lesson2.Shishlova.Study;

import ru.turing.courses.lesson2.Shishlova.Study.StudyingMood;
import ru.turing.courses.lesson2.Shishlova.Study.Studying;
import ru.turing.courses.lesson2.Shishlova.Study.Study;

// вторая реализация интерфейса Studying
public class StudyingConsole implements Studying {

    // реализация метода study() для StudyingConsole
    public void study() {
        System.out.println("Открываю консоль для учебы...");
    }

    // реализация метода passExam() для StudyingConsole
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Экзамен сдан! :)");
        } else {
            System.out.println("Экзамен не сдан :( Учись лучше!");
        }
        System.out.println("Закрываю консоль.");
    }
}