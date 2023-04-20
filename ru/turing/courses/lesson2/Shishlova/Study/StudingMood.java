package ru.turing.courses.lesson2.Shishlova.Study;

import ru.turing.courses.lesson2.Shishlova.Study.StudyingConsole;
import ru.turing.courses.lesson2.Shishlova.Study.Studying;
import ru.turing.courses.lesson2.Shishlova.Study.Study;

class StudyingMood implements Studying {
    private int mood; // настроение

    public StudyingMood() {
        mood = 50; // начальное настроение 50 из 100
    }

    // реализация метода study() для StudyingMood
    public void study() {
        mood -= 10; // учеба снижает настроение
        System.out.println("Учу математику...");
    }

    // реализация метода passExam() для StudyingMood
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Экзамен сдан! :)");
            mood += 20; // успешная сдача экзамена улучшает настроение
        } else {
            System.out.println("Экзамен не сдан :( Учись лучше!");
            mood -= 20; // неуспешная сдача экзамена ухудшает настроение
        }
    }

    // геттер для поля mood
    public int getMood() {
        return mood;
    }
}
