package ru.turing.courses.lesson2.byazrov;

public class Student1 implements Studying {
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println("Student " + name + " don't care about exam");
    }

    @Override
    public void passExam(boolean passed) {
        System.out.println(passed ? "hooray" : "idc");
    }
}
