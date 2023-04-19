package ru.turing.courses.lesson2.privalov.studying;

public class Student implements Studying {

    public Student() {
    }

    @Override
    public void study() {
        System.out.println("Лучшее обучение -- во время сна");
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Студент хорошо поучился, сдал экзамен и идёт пить пиво");
        } else {
            System.out.println("Студент забивает на проваленный экзамен и все равно идёт пить пиво");
        }
    }
}
