package ru.turing.courses.lesson2.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User();
        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        int year = user1.years();
        int month = user1.month();
        System.out.println(year);
        System.out.println(month);
        user1.addressMy();
        Animal dogPetr = new Dog("petr", 4, "w", 5, true, "labrador");
        Dog dogFedor = new Dog("fedor", 4, "m", 12, false, "sheepdog");
        Lion lionBoniface = new Lion("Boniface",4,"m",45,true);
        lionBoniface.lionMakeTrick(lionBoniface.isWorkInCircus());
        dogFedor.run();
        dogPetr.run();
        dogFedor.stickOf(dogFedor.isStick());
    }
}
