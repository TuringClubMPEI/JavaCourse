package ru.turing.courses.lesson2.Filippov.Studing;

public class Pupil implements Studying {
    private String name;

    public String getName(){
        return name;
    }
    @Override
    public void study() {
        System.out.println("В компик играю");
    }

    @Override
    public void passExam() {
        System.out.println("Какие экзамены, я в компик играю");
    }

    public Pupil(String name) {
        this.name = name;
    }
}

