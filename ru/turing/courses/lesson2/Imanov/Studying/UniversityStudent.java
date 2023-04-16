package ru.turing.courses.lesson2.Imanov.Studying;

import ru.turing.courses.lesson2.Imanov.Animal.Animal;
import ru.turing.courses.lesson2.Imanov.Animal.Gender;

public class UniversityStudent extends Animal implements Studying {
    private boolean drunk; // ну такие пироги

    public UniversityStudent(String name, int age, Gender sex, int mood, boolean drunk){
        super(name, age, sex, mood);
        this.drunk = drunk;
    }

    // переопределенные функции-члены класса из интерфейса
    @Override
    public void study() {
        mood = Math.max(mood - 5, 0);
        if (mood < 10){
            sleep();
        }
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            drunk = true;
        } else {
            drunk = false;
            study();
        }
    }

    // переопределенные функции-члены класса из абстрактного родителя

    @Override
    public void voice() {
        System.out.println("Я Cтудент");
    }

    @Override
    public void sleep() {
        mood = Math.min(mood + 25, 100);
    }

    // геттер и сеттер

    public void setDrunk(boolean drunk) {
        this.drunk = drunk;
    }

    public boolean isDrunk() {
        return drunk;
    }
}
