package ru.turing.courses.lesson1.byazrov;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person = new Person();
        System.out.println("Введите своё ФИО: ");
        String fioLine = input.nextLine();
        System.out.println("Введите свой адрес: ");
        String addressLine = input.nextLine();
        System.out.println("Введите свою дату рождения: ");
        String birthDateLine = input.nextLine();

        person.setFio(fioLine);
        person.setAddress(addressLine);
        person.setBirthDate(birthDateLine);

        person.getFio();
        person.getAddress();
        System.out.println("Количество прожитых лет пользователя " + person.getFirstName() + ' ' + person.getSecondName() + ' ' + person.getMiddleName() + ": " + person.getYearAge());
        System.out.println("Количество прожитых месяцев пользователя " + person.getFirstName() + ' ' + person.getSecondName() + ' ' + person.getMiddleName() + ": " + person.getMonthAge());
    }
}

class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    private int birthDay;
    private int birthMonth;
    private int birthYear;

    private String country;
    private String city;
    private String street;
    private String house;
    private String flat;

    //Ввод ФИО
    public void setFio(String fioLine) {
        String[] fio = fioLine.split(" ");
        firstName = fio[0];
        lastName = fio[1];
        middleName = fio[2];
    }

    //возврат информации о ФИО пользователя
    public void getFio() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(middleName);
    }

    public String getFirstName() {      //возврат имени
        return firstName;
    }

    public String getSecondName() {     //возврат фамилии
        return lastName;
    }

    public String getMiddleName() {      //возврат отчества
        return middleName;
    }

    //присвоение полям класса соответсвующих значений даты рождения
    public void setBirthDate(String birthDateLine) {
        String[] birthDate = birthDateLine.split("\\.");
        birthDay = Integer.parseInt(birthDate[0]);
        birthMonth = Integer.parseInt(birthDate[1]);
        birthYear = Integer.parseInt(birthDate[2]);
    }

    //возврат количества прожитых полных месяцев пользователя
    public int getMonthAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, LocalDate.now()).getMonths() + 12*Period.between(birthDate, LocalDate.now()).getYears();
    }

    //возврат количества прожитых полных лет пользователя
    public int getYearAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    //Присвоение полям адреса соответствующих значений адреса
    public void setAddress(String addressLine) {
        String[] addressArr = addressLine.split(", ");
        String[] address = new String[5];

        for (int i = 0; i < 5; ++i) {
            String[] addressCluster = addressArr[i].split(": ");
            address[i] = addressCluster[1];
        }

        country = address[0];
        city = address[1];
        street = address[2];
        house = address[3];
        flat = address[4];
    }

    //Вывод информации об адресе пользователя
    public void getAddress() {
        System.out.println("Адрес пользователя " + firstName + ' ' + lastName + ' ' + middleName + ": \n" + country + "\nг. " + city + " \nул. " + street + "\nд. " + house + "\nкв. " + flat);
    }
}
