package ru.turing.courses.lesson2.Yemelyanov;

import java.util.Random;

public class BadStudent implements Studying {
    //Переопределение методов во втором случае
    @Override
    public void study(){
        Random rand = new Random();
        int mood = rand.nextInt(99);
        System.out.println("Настроение на учебу: " + Integer.toString(mood));
        int sleepTime = rand.nextInt(10);
        System.out.println("*Спит уже " + Integer.toString(sleepTime) + " часов*");
    }

    @Override
    public void passExam(boolean passed){
        /*Random rand = new Random();
        int mark = rand.nextInt(3,5);
        String markString = passed ? Integer.toString(mark) : Integer.toString(2);
        System.out.println("Оценка за экз: " + markString);*/
    }
}
