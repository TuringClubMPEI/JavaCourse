package ru.turing.courses.lesson2.Filippov.Studing;

public class Student implements Studying {
    private String name;
    private int count = 0;

    public String getName(){
        return name;
    }
    public void study() {
        count++;
        System.out.println("Учу мат часть");

    }

    public void passExam() {//чуть чуть изменил метод
        if (count > 4) {
            System.out.println("Ты конечно крутой, но надо было выучить только 4 предмета\nэкзамен сдан");
        } else {
            if (count == 4) {
                System.out.println("Экзамен сдан");
            } else System.out.println("Молодой человек, на пересдачу \n буду учить мат часть");
        }
    }

    public Student(String name) {
        this.name = name;
    }
}


