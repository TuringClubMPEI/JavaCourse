package ru.turing.courses.lesson2.privalov.studying;

public class Schooler implements Studying {
    public int amountOfLessonsTomorrow;


    public Schooler(int amountOfLessonsTomorrow) {
        this.amountOfLessonsTomorrow = amountOfLessonsTomorrow;
    }

    @Override
    public void study() {
        System.out.println("Школьник идёт учить свои " + this.amountOfLessonsTomorrow + " уроков на завтра");
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Школьник наслаждается прогулкой после школы");
        } else {
            System.out.println("Школьник упорно готовится к повторному написанию экзамена");
        }
    }
}
