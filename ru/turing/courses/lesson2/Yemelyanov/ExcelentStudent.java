package ru.turing.courses.lesson2.Yemelyanov;

import ru.turing.courses.lesson2.Yemelyanov.Studying;

public class ExcelentStudent implements Studying {
//Переопределение методов интерфейся в первом случае
    @Override
    public void study(){
        System.out.println("Реализовываю интерфейсы на джаве у учебной форме, привет Turing MPEI!");
        return;
    }

    @Override
    public void passExam(boolean passed){
        String message = passed ? "Ура, сдал!" : "Вот незадача, провалился(";
        System.out.println(message);
        return;
    }
}
