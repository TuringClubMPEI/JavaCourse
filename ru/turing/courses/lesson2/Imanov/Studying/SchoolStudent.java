package ru.turing.courses.lesson2.Imanov.Studying;

import ru.turing.courses.lesson2.Imanov.Animal.Animal;
import ru.turing.courses.lesson2.Imanov.Animal.Gender;

public class SchoolStudent extends Animal implements Studying {

    // я снова извиняюсь
    private boolean balls;

    // конструктор
    public SchoolStudent(String name, int age, Gender sex, int mood, boolean balls){
        super(name, age, sex, mood);
        if (sex != Gender.MALE){
            this.balls = false;
        } else {
            this.balls = balls;
        }
    }

    // переопределенные функции-члены класса из интерфейса
    @Override
    public void study() {
        System.out.println("я поучился");
    }

    @Override
    public void passExam(boolean passed) {
        if (passed){
            flyToThailand();
            System.out.println("Поступаю в вуз");
        } else {
            study();
        }
    }

    // переопределенные функции-члены класса из абстрактного родителя
    @Override
    public void voice() {
        System.out.println("я школьник");
    }

    @Override
    public void sleep() {
        mood = Math.min(100, mood + 10);
    }

    // БАЗА
    public void flyToThailand(){
        mood = 100;
        sex = Gender.FEMALE;
        balls = true;
    }

    // геттер и сеттер

    public boolean isBalls() {
        return balls;
    }

    public void setBalls(boolean balls) {
        this.balls = balls;
    }
}
