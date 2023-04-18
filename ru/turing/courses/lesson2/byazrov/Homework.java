package ru.turing.courses.lesson2.byazrov;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите свой адрес: ");
        String addressLine = input.nextLine();
        System.out.println("Введите свою дату рождения: ");
        String birthDateLine = input.nextLine();

        System.out.println(UserProcessor.getYearAge(birthDateLine));
        System.out.println(UserProcessor.getMonthAge(birthDateLine));
        UserProcessor.addressFormatting(addressLine);

        Animal cat1 = new Cat("Barsik", 10, 9, true);
        Animal dog1 = new Dog("Rex", 12, true, 10);
        Animal cat2 = new Cat("Murzilka", 3, 9, true);
        Animal cat2TwinBrotherWithSameName = new Cat("Murzilka", 3, 9, true);

        dog1.goForAWalk();
        cat1.goForAWalk();
        dog1.makeSomeNoise();
        cat1.makeSomeNoise();

        System.out.println(cat1.equals(cat2));
        System.out.println(cat2.equals(cat2TwinBrotherWithSameName));
        System.out.println("Mursilka's hashcod - " + cat2.hashCode() + ' ' + "and his brother's hashcode - " + cat2TwinBrotherWithSameName.hashCode());

        Student1 student1 = new Student1("Anton");
        Student2 student2 = new Student2("Sanya");

        student1.study();
        student1.passExam(true);

        student2.study();
        student2.passExam(true);
    }
}
