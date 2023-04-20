package ru.turing.courses.lesson2.Shishlova;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Objects;

public class Homework2 {
    // метод для подсчета полных лет пользователя
    public static int calculateAgeInYears(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // метод для подсчета полных месяцев, которые пользователь прожил
    public static long calculateAgeInMonths(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).toTotalMonths();
    }

    // метод для преобразования полного адреса пользователя в краткий формат
    public static String getShortAddress(String fullAddress) {
        String[] addressParts = fullAddress.split(", ");
        String country = addressParts[0].split(": ")[1];
        String city = addressParts[1].split(": ")[1];
        String street = addressParts[2].split(": ")[1];
        String house = addressParts[3].split(": ")[1];
        String apartment = addressParts[4].split(": ")[1];
        return country + "\n" + "г. " + city + "\n" + "ул. " + street + "\n" + "д. " + house + "\n" + "кв. " + apartment;
    }

    public static void main(String[] args) {
        // создаем объект типа Scanner для считывания пользовательского ввода
        Scanner scanner = new Scanner(System.in);

        // запрашиваем у пользователя ФИО и дату рождения
        System.out.print("Введите свое ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите свою дату рождения в формате дд.мм.гггг: ");
        String birthDateString = scanner.nextLine();

        // преобразуем введенную пользователем дату рождения в объект LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        // запрашиваем у пользователя адрес и переводим его в краткий формат
        System.out.print("Введите свой адрес в формате 'страна: Россия, город: Москва, улица: Авиамоторная, дом: 15, квартира: 24': ");
        String fullAddress = scanner.nextLine();
        String shortAddress = getShortAddress(fullAddress);

        // выводим результаты
        int ageInYears = calculateAgeInYears(birthDate);
        long ageInMonths = calculateAgeInMonths(birthDate);
        System.out.println("Вам " + ageInYears + " лет");
        System.out.println("Вы прожили " + ageInMonths + " полных месяцев");
        System.out.println("Ваш адрес:");
        System.out.println(shortAddress);

        // создаем объекты наших животных
        Cat cat = new Cat("Уголек", "черный", 7);
        Dog dog = new Dog("Николь", "серая", 40);

        // вызываем методы объектов и выводим результаты
        System.out.println(cat.getName() + " говорит: " + cat.makeSound());
        System.out.println(dog.getName() + " говорит: " + dog.makeSound());
        System.out.println(cat.getName() + " спит: " + cat.sleep());
        System.out.println(dog.getName() + " спит: " + dog.sleep());
    }
}

// класс животное (абстрактный)
abstract class Animal {
    // поля животного
    protected String name;
    protected String color;

    // конструктор животного
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // метод, который будет реализован в дочерних классах
    public abstract String makeSound();

    // метод животного "спать"
    public String sleep() {
        return "zzz";
    }

    // геттер для поля name
    public String getName() {
        return name;
    }

    // геттер для поля color
    public String getColor() {
        return color;
    }
}

// класс кошка (наследник класса животное)
class Cat extends Animal {
    // новое поле кошки
    private int age;

    // конструктор кошки
    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }

    // реализация метода makeSound() для кошки
    public String makeSound() {
        return "Мяу";
    }

    // переопределение метода sleep() для кошки
    public String sleep() {
        return "Кошка спит...";
    }

    // геттер для поля age
    public int getAge() {
        return age;
    }

    // переопределение метода equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    // переопределение метода hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}

// класс собака (наследник класса животное)
class Dog extends Animal {
    // новое поле собаки
    private int weight;

    // конструктор собаки
    public Dog(String name, String color, int weight) {
        super(name, color);
        this.weight = weight;
    }

    // реализация метода makeSound() для собаки
    public String makeSound() {
        return "Гав";
    }

    // геттер для поля weight
    public int getWeight() {
        return weight;
    }

    // переопределение метода equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight && Objects.equals(name, dog.name) && Objects.equals(color, dog.color);
    }

    // переопределение метода hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight);
    }
}


// интерфейс Studying
interface Studying {
    void study();
    void passExam(boolean passed);
}

// реализация интерфейса Studying
class StudyingMood implements Studying {
    private int mood; // настроение

    public StudyingMood() {
        mood = 50; // начальное настроение 50 из 100
    }

    // реализация метода study() для StudyingMood
    public void study() {
        mood -= 10; // учеба снижает настроение
        System.out.println("Учу математику...");
    }

    // реализация метода passExam() для StudyingMood
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Экзамен сдан! :)");
            mood += 20; // успешная сдача экзамена улучшает настроение
        } else {
            System.out.println("Экзамен не сдан :( Учись лучше!");
            mood -= 20; // неуспешная сдача экзамена ухудшает настроение
        }
    }

    // геттер для поля mood
    public int getMood() {
        return mood;
    }
}

// вторая реализация интерфейса Studying
class StudyingConsole implements Studying {

    // реализация метода study() для StudyingConsole
    public void study() {
        System.out.println("Открываю консоль для учебы...");
    }

    // реализация метода passExam() для StudyingConsole
    public void passExam(boolean passed) {
        if (passed) {
            System.out.println("Экзамен сдан! :)");
        } else {
            System.out.println("Экзамен не сдан :( Учись лучше!");
        }
        System.out.println("Закрываю консоль.");
    }
}
