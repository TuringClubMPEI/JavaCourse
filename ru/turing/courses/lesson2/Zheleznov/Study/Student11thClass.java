package ru.turing.courses.lesson2.Zheleznov.Study;

public class Student11thClass implements Studying {
    protected boolean passed;
    protected int mood;
    protected int tiredness;

    public Student11thClass(boolean passed, int mood, int tiredness) {
        this.passed = passed;
        this.mood = mood;
        this.tiredness = tiredness;
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            mood +=50;
        } else {
            mood -=50;
        }
        System.out.println("настроение: " + mood);
    }

    @Override
    public void study() {
        if (tiredness >= 75) {
            System.out.println("пора отдыхать");
        }
        if (tiredness < 75 && tiredness >= 50) {
            System.out.println("силы еще есть, но на исходе");
        }
        if (tiredness < 50) {
            System.out.println("Я сдам ЕГЭ");
        }
    }
}
