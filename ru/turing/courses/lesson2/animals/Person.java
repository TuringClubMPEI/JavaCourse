package ru.turing.courses.lesson2.animals;

import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name; //имя
    private String surname; //фамилия
    private String secondName; //отчество
    private LocalDate birthday; //дата рождения
    private String address; // адрес проживания

    public int getFullMonths(){ //вывод прожитых месяцев
        LocalDate now = LocalDate.now();
        Period diff = Period.between(this.birthday, now); //через период это просто
        return diff.getMonths()+12* diff.getYears();
    }

    public int getFullYears() {//вывод полных прожитых лет
        LocalDate now = LocalDate.now();
        Period diff = Period.between(this.birthday, now); //также через период
        return diff.getYears();
    }
    public void printShortAddress(String regex){ //вывод короткой записи адреса
        //String regex = ":.+?,$?";
        Pattern pattern = Pattern.compile(regex); //регулярное выражение
        Matcher matcher = pattern.matcher(this.address); //поисковик регулярных выражений в строке
        int countString = 0; //на 2-5 выводе нужно добавить г., ул. и тд
        while(matcher.find()){ //поиск всех вхождений
            countString++;
            switch (countString){
                case 2:{
                    System.out.print("г. ");
                    break;
                }
                case 3:{
                    System.out.print("ул. ");
                    break;
                }
                case 4:{
                    System.out.print("д. ");
                    break;
                }
                case 5:{
                    System.out.print("кв. ");
                    break;
                }
            }
            int start=matcher.start(); //индекс символа ":"
            int end=matcher.end(); //индекс символа ","
            System.out.println(this.address.substring(start+2,end-1)); //выбираем очередную подстроку без ":" и ","
        }
    }
    public String getBirthday(String regex) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(regex); //задаем формат строки
        return this.birthday.format(formatter); //переводим дату в строку по формату
    }

    public boolean setBirthday(String strDate, String regex) {
        //String regex  = "dd.MM.yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(regex);//задаем формат строки
        try{
            this.birthday = LocalDate.parse(strDate, formatter); //переводим строку с форматом в дату
            return true; //если получилось перевести, то мы ввели всё правильно и нужно возвратить true
        }
        catch (DateTimeParseException ex){
            return false; //если формат строки не такой, или дата не правильная(месяц = 13), то выскачет исключение
        }
    }

    public boolean setAddres(String strAddres, String regex) {
        //String regex = "^страна: .+, город: .+, улица: .+, дом: \\d{2}, квартира: \\d{2}$";
        Pattern pattern = Pattern.compile(regex); //задаем регулярное выражение
        if(Pattern.matches(regex, strAddres)){ //если строка соответствует этому выражени.
            this.address = strAddres; //то мы считываем её
            return true; //и сообщаем об успешном считывании
        }
        else{
            return false;
        }
    }

    public void setFIO(String name, String surname, String secondName){ //вводим всё ФИО сразу
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getSecondName() {
        return secondName;
    }
}
