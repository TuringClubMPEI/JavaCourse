package ru.turing.courses.lesson2.Imanov.UserProcessor;

import java.util.Scanner;
import static ru.turing.courses.lesson2.Imanov.UserProcessor.UserProcessor.userInformation;

public class UserProcessorTest {
    // можно (и вообще лучше сделать так) было конечно сделать так, чтобы не нужно было подтверждать постоянно корректность пройденных тестов, но я так не сделал
    public static boolean testExamplesPassed(){
        userInformation("Путин Владимир Владимирович",
                "07.10.1952",
                "страна: Россия, город: Москва, улица: самая крутая, дом: самый крутой, квартира: 777");
        userInformation("Java Turing Turingвич",
                "29.03.2023",
                "страна: Россия, город: Москва, улица: Красноказарменная, дом: 14, квартира: 007");
        userInformation("F I O",
                "07.07.0007",
                "страна: страна, город: город, улица: улица, дом: дом, квартира: квартира");
        userInformation("тут дополнительный тест: записана дата DAY.MONTH.YEAR-1 ",
                "08.04.2022",
                "страна: страна, город: город, улица: улица, дом: дом, квартира: квартира");

        Scanner scanner = new Scanner(System.in);
        System.out.println("все хорошо с тестами? y/n: ");
        String answer = scanner.nextLine();
        return answer.equals("y");
    }
}
