package ru.turing.courses.lesson2.byazrov;

public class Student2 implements Studying{

    private String name;

    public Student2(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println("Student " + name + " studies long and hard");
    }

    @Override
    public void passExam(boolean passed) {
        System.out.println(passed ? "hooray" : "sadge");
    }
}
