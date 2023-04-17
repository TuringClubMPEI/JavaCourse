package ru.turing.courses.lesson2.Yemelyanov;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите дату рождения персонажа: ");
        Scanner input = new Scanner(System.in);

        String inputDate = input.nextLine();
        System.out.println("Введите адрес в формате: (страна: -, город: -, улица: -, дом: -, квартира: -.)");

        String adressByFormat = input.nextLine(); //Ввод адреса по формату
        DateTimeFormatter validDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy"); //Конвертация введенной даты по формату

        LocalDate birthDay = LocalDate.parse(inputDate, validDateFormat); //День рожжения по формату
        Person person = new Person(birthDay, adressByFormat);

        UserProcessor personInfo = new UserProcessor();
        int age = personInfo.getAge(person, 1); //Вызов метода с параметром для расчета прожитых лет
        int ageMon = age * 12 + personInfo.getAge(person, 0); //Вызов метода с параметром для расчета прожитых месяцев
        String[] adressParts = {"-", "-", "-", "-", "-"}; //Инициализацяи массива строк для заполнения полей адреса
        personInfo.convertAdress(person, adressParts); //Парсинг адреса

        System.out.println("====================ИНФОКАРТОЧКА О ГРАЖДАНИНЕ======================");
        System.out.println("На текущий момент вы прожили " + age +
                " лет. Это эквивалентно " + ageMon + " полных месяцев");
        System.out.println("Адрес: ");
        personInfo.showAdress(adressParts);

    }

}
