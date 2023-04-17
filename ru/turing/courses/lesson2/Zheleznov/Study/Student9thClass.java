package ru.turing.courses.lesson2.Zheleznov.Study;

public class Student9thClass implements Studying {
    boolean passed;

    boolean summerMood;

    boolean everythingIsLearned;

    public Student9thClass(boolean passed, boolean summerMood, boolean everythingIsLearned) {
        this.passed = passed;
        this.summerMood = summerMood;
        this.everythingIsLearned = everythingIsLearned;
    }

    @Override
    public void passExam(boolean passed) {
        if (passed) {
            summerMood = true;
            System.out.println("ура, можно в 10 класс");
        } else {
            System.out.println("в колледж на платку");
        }


    }

    @Override
    public void study() {
        if (everythingIsLearned) {
            System.out.println("Спать");
        } else {
            System.out.println("надо еще посидеть");
        }
    }

}

