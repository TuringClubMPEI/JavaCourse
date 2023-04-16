package ru.turing.courses.lesson2.Imanov.Studying;

import ru.turing.courses.lesson2.Imanov.Animal.Animal;
import ru.turing.courses.lesson2.Imanov.Animal.Gender;

public class Timur extends Animal implements Studying {
    boolean drunk; // ну такие пироги
    public Timur(int mood, boolean drunk){
        super("Timur", 19, Gender.MALE, mood);
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
        System.out.println("Я Тимурка");
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
