package ru.turing.courses.lesson2.Gasin;

public class TuringStudent implements Studying {
    private String course;
    private int mergedPullRequests;

    public TuringStudent(String course, int mergedPullRequests) {
        this.course = course;
        this.mergedPullRequests = mergedPullRequests;
    }

    @Override
    public void study() {
        System.out.println("Учусь на курсе " + course + " и пока что у меня смержили " + mergedPullRequests + " ПРов!");
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Ура! Начинаю работу над проектами!");
        } else {
            System.out.println("Наверное надо было лучше и вовремя делать домашку :(");
        }
    }
}
